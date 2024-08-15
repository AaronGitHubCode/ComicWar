package app.comicwar.comic

import app.comicwar.R

import app.comicwar.utils.API_URL

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle

import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import kotlinx.coroutines.async
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory

class ComicsPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.comics_page_fragment_layout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.comics_list)

        lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.CREATED) {
                val comicService = async {
                    withContext(Dispatchers.IO) {
                        Retrofit.Builder()
                            .baseUrl(API_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                            .create(ComicService::class.java)
                    }
                }

                val service = comicService.await()

                if (comicService.isCompleted) {

                }
            }
        }
    }
}
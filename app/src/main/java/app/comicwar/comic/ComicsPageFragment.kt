package app.comicwar.comic

import app.comicwar.R

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
class ComicsPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.comics_page_fragment_layout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = view.findViewById<RecyclerView>(R.id.comics_list).run {
        layoutManager = GridLayoutManager(context, 1)
        adapter = ComicsPageAdapter(listOf()).apply {
            onComicSelect = { comic: Comic ->
                parentFragmentManager.commit {
                    replace(R.id.fragment_container, ComicInfoFragment(comic))
                }
            }
        }
    }
}
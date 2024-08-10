package app.comicwar.ui

import app.comicwar.R

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import androidx.viewpager2.widget.ViewPager2

class CollectionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.collection_fragment_layout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager)
        viewPager.adapter = Book(this)
    }
}
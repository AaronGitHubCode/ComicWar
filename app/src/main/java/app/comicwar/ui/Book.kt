package app.comicwar.ui

import app.comicwar.comic.ComicsPageFragment

import androidx.fragment.app.Fragment

import androidx.viewpager2.adapter.FragmentStateAdapter

class Book(fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val fragments: Array<Fragment> = arrayOf(
        ComicsPageFragment()
    )

    override fun getItemCount(): Int = fragments.size
    override fun createFragment(position: Int): Fragment = fragments[position]
}
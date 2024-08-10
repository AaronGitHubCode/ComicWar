package app.comicwar.comic

import app.comicwar.R

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

typealias ComicViewHolder = ComicsPageAdapter.ComicViewHolder

class ComicsPageAdapter(private val comics: List<Comic>) : Adapter<ComicViewHolder>() {
    lateinit var onComicSelect: (Comic) -> Unit
    inner class ComicViewHolder(internal val root: View) : ViewHolder(root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComicViewHolder = ComicViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.comic_item_layout, parent, false))

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) = holder.root.run {
        setOnClickListener {
            onComicSelect(comics[position])
        }
    }

    override fun getItemCount() = comics.size
}
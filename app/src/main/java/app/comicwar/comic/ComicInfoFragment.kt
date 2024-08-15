package app.comicwar.comic

import app.comicwar.R

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView

import androidx.fragment.app.Fragment

import com.squareup.picasso.Picasso

class ComicInfoFragment(private val comic: Comic) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.comic_info_fragment_layout, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = view.run {
        val comicPortrait = findViewById<ImageView>(R.id.comic_big_portrait)
        Picasso.get().load(comic.thumbnail.path).into(comicPortrait)

        val comicDescription = findViewById<TextView>(R.id.comic_description)
        comicDescription.text = comic.description
    }
}
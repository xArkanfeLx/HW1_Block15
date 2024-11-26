package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val namePictureTV:TextView = view.findViewById(R.id.nameTV)
        val authorPictureTV:TextView = view.findViewById(R.id.authorTV)
        val imagePictureTV:ImageView = view.findViewById(R.id.imgIV)

        val viewPagerItem = arguments?.getSerializable("vp") as Picture

        namePictureTV.text = viewPagerItem.name
        authorPictureTV.text = viewPagerItem.author
        imagePictureTV.setImageResource(viewPagerItem.img)
    }
}
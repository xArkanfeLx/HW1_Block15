package com.example.viewpager2

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomVPAdapter(val fragment: FragmentActivity,private val pictures:MutableList<Picture>):FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int  = pictures.size

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("vp" to pictures[position])
        return fragment
    }
}
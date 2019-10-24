package com.learning.timercubos

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragmentList: ArrayList<Fragment> = arrayListOf<Fragment>()
    private val titleList: ArrayList<String> = arrayListOf<String>()

    init {
        titleList.add("Timer")
        titleList.add("StopWatch")
        fragmentList.add((TimerFragment()))
        fragmentList.add((StopWatchFragment()))
    }

    override fun getCount(): Int = fragmentList.size

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getPageTitle(position: Int): CharSequence? = titleList[position]

}
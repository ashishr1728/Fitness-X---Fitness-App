package com.example.finalprojectcse225

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 5;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return Fragment1()
            }
            1 -> {
                return Fragment2()
            }
            2 -> {
                return Fragment3()
            }
            3 -> {
                return Fragment4()
            }
            4 -> {
                return Fragment5()
            }
            else -> {
                return Fragment1()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Chest"
            }
            1 -> {
                return "Back"
            }
            2 -> {
                return "Arms"
            }
            3 -> {
                return "Legs"
            }
            4 -> {
                return "Abs"
            }
        }
        return super.getPageTitle(position)
    }

}
package ir.mnemati.schooldashboard

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterTab(fr: FragmentManager): FragmentPagerAdapter(fr) {

    private val listFragment = arrayListOf<Fragment>()
    private val listFragmentTitle = arrayListOf<String>()

    fun addFragment(fragment: Fragment, title: String){
        listFragment.add(fragment)
        listFragmentTitle.add(title)
    }

    override fun getItem(position: Int): Fragment = listFragment[position]
    override fun getCount(): Int = listFragment.count()

    override fun getPageTitle(position: Int): CharSequence? = listFragmentTitle[position]

}
package ir.mnemati.schooldashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapterTest = AdapterTab(supportFragmentManager)
        adapterTest.addFragment(f1Fragment(), "دانش آموزی")
        adapterTest.addFragment(f2Fragment(), "ادرای و مالی")
        adapterTest.addFragment(f3Fragment(), "درباره ما")
        val vp:ViewPager = findViewById(R.id.vp_main)
        vp.adapter = adapterTest

        val tb:TabLayout = findViewById(R.id.tb_layout)
        tb.setupWithViewPager(vp)

    }

    fun replaceFragment(fragment: Fragment){
        /*
        val fTransaction = supportFragmentManager.beginTransaction()
        fTransaction.replace(R.id.fl_main, fragment)
        fTransaction.commit()
        */
    }
}
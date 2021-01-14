package ir.mnemati.schooldashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapterTest = AdapterTab(supportFragmentManager)
        adapterTest.addFragment(f3Fragment(), "درباره ما")
        adapterTest.addFragment(f2Fragment(), "اداری و مالی")
        adapterTest.addFragment(f1Fragment(), "دانش آموزی")

        val vp:ViewPager = findViewById(R.id.vp_main)
        vp.adapter = adapterTest
        vp.setCurrentItem(adapterTest.getCount());

        val tb:TabLayout = findViewById(R.id.tb_layout)
        tb.setupWithViewPager(vp)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //return super.onOptionsItemSelected(item)
        if (item != null)
            when(item.itemId){
                R.id.menu_light -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
                R.id.menu_dark -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
                R.id.menu_exit -> {
                    finish();
                    exitProcess(0);
                }
            }
        return true
    }
}
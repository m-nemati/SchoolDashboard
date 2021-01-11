package ir.mnemati.schooldashboard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment

class f2Fragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.f2_fragment, container,false)
        val root2 = inflater.inflate(R.layout.f2_fragment, container,false)

        val listData2 = listOf<DataModel>(
                DataModel("سامانه ضمن خدمت", "ltms"),
                DataModel("فیش حقوقی", "fish"),
                DataModel("کارتابل فرهنگیان", "profile"),
                DataModel("سامانه جامع منابع انسانی", "hrm"),
                DataModel("سامانه ارزیابی عملکرد", "nezarat"),
                DataModel("پایگاه اطلاع رسانی اداره کل گیلان", "guilan"),
                DataModel("پایگاه اطلاع رسانی اداره رحمت آباد و بلوکات", "rahm"),
                DataModel("اتوماسیون اداری رحمت آباد و بلوکات", "dbr")
        )

        val lvAdapter2 = CustomAdapter(listData2)

        val lv_f2: ListView = root2.findViewById(R.id.lv_f2)
        lv_f2.adapter = lvAdapter2

        lv_f2.setOnItemClickListener { _, _, position, _ ->

            var url_str2 = ""
            when (position) {
                0 -> url_str2 = "https://ltms.medu.ir"
                1 -> url_str2 = "https://fish.medu.ir/"
                2 -> url_str2 = "http://profile.medu.ir"
                3 -> url_str2 = "http://hrm.medu.ir"
                4 -> url_str2 = "https://nezarat.medu.ir/"
                5 -> url_str2 = "https://guilan.medu.ir"
                6 -> url_str2 = "https://3768-gilan.medu.ir"
                7 -> url_str2 = "http://dbr68.giledu.ir/"

            }
            val url = Uri.parse(url_str2)
            val intentWeb = Intent(Intent.ACTION_VIEW, url)
            //if(intentWeb.resolveActivity(root.packageManager) != null){ startActivity(intentWeb) }
            startActivity(intentWeb)
        }
        return root2
    }
}
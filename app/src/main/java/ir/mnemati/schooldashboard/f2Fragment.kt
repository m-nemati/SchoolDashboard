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
                DataModel("سامانه ضمن خدمت", "ltms","https://ltms.medu.ir","توضیحات: سامانه آموزش جامع فرهنگیان به منظور برگزاری دوره های آموزشی ضمن خدمت برای پرسنل مورد استفاده قرار می گیرد."),
                DataModel("فیش حقوقی", "fish", "https://fish.medu.ir","توضیحات: سامانه فیش حقوقی به منظور مشاهده فیش حقوقی ماهانه فرهنگیان استفاده می شود."),
                DataModel("کارتابل فرهنگیان", "profile","http://profile.medu.ir","توضیحات: کارتابل فرهنگیان سایتی به منظور اطلاعات پرسنلی هر فرد و مشاهده احکام و پرونده پرسنلی است."),
                DataModel("سامانه جامع منابع انسانی", "hrm","http://hrm.medu.ir","توضیحات: این سامانه یک سامانه جامع می باشد که به منظور انجام امور کارگزینی پرسنل استفاده می گردد."),
                DataModel("سامانه ارزیابی عملکرد", "nezarat","https://nezarat.medu.ir","توضیحات: این سامانه به منظور ثبت گزارشات و فرم های ارزیابی مدارس کاربرد دارد."),
                DataModel("پایگاه اطلاع رسانی اداره کل گیلان", "guilan","https://guilan.medu.ir","توضیحات: این سایت به منظور آگاهی از آخرین اخبار و اطلاعات اداره کل آموزش و پرورش استان گیلان می باشد."),
                DataModel("پایگاه اطلاع رسانی اداره رحمت آباد و بلوکات", "rahm","https://3768-gilan.medu.ir","توضیحات: این سایت به منظور آگاهی از آخرین اخبار و اطلاعات اداره آموزش و پرورش منطقه رحمت آباد و بلوکات می باشد."),
                DataModel("اتوماسیون اداری رحمت آباد و بلوکات", "dbr","http://dbr68.giledu.ir","توضیحات: این سایت به منظور ارسال و مشاهده بخشنامه های اداری مورد استفاده پرسنل قرار می گیرد.")
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
package ir.mnemati.schooldashboard

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class f1Fragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.f1_fragment, container,false)

        val listData = listOf<DataModel>(
            DataModel("سامانه سیدا", "sida", "توضیحات: سامانه یکپارچه دانش آموزی سیدا، به منظور ثبت نمرات و ارزشیابی های دی ماه و خرداد ماه هر سال و ارائه کارنامه توسط مدرسه استفاده می شود."),
            DataModel("سناد پیش دبستان", "sch","توضیحات: سامانه سناد پیش دبستان به منظور ثبت نام و کلاس بندی و تهیه دفتر آمار در مقطع پیش دبستان توسط مدارس مورد استفاده می گردد."),
            DataModel("سناد ابتدایی", "psnd", "توضیحات: سامانه سناد ابتدایی به منظور ثبت نام و کلاس بندی و تهیه دفتر آمار در مقطع ابتدایی توسط مدارس مورد استفاده می گردد."),
            DataModel("سناد متوسطه اول", "mone", "توضیحات: سامانه سناد متوسطه اول به منظور ثبت نام و کلاس بندی و تهیه دفتر آمار در مقطع متوسطه اول توسط مدارس مورد استفاده می گردد."),
            DataModel("سناد متوسطه دوم", "mtwo", "توضیحات: سامانه سناد متوسطه دوم به منظور ثبت نام و کلاس بندی و تهیه دفتر آمار در مقطع متوسطه دوم توسط مدارس مورد استفاده می گردد."),
            DataModel("سایت همگام", "hamgam", "توضیحات: سامانه همگام به منظور شرکت دانش آموزان در جشنواره ها، مشاده برنامه کلاسی، دریافت مشاوره تحصیلی و ... مورد استفاده قرار می گیرد."),
            DataModel("سامانه امین", "amin", "توضیحات: سامانه جامع امین در مقاطع متوسطه دوم به منظور انجام امورات فارغ التحصیلی و ارائه گواهینامه تحصیلی بکار می رود."),
            DataModel("سایت فاینال", "finall", "توضیحات: سامانه فاینال به منظور ارسال و دریافت اطلاعات شرکت کنندگان در امتحانات نهایی کشوری استفاده می شود.")
        )

      //  val lvAdapter = ArrayAdapter<String>(root.context,android.R.layout.simple_list_item_1,listData)
        val lvAdapter = CustomAdapter(listData)

        val lv_f1:ListView = root.findViewById(R.id.lv_f1)
        lv_f1.adapter = lvAdapter

        lv_f1.setOnItemClickListener { _, _, position, _ ->

            //Toast.makeText(activity, "${listData[position]}", Toast.LENGTH_SHORT).show()
            //Toast.makeText(activity, "در نسخه پولی سایت باز می شود :)", Toast.LENGTH_SHORT).show()
            var url_str = ""
            when (position) {
                0 -> url_str = "http://sida.medu.ir"
                1 -> url_str = "https://p-snd.medu.ir/"
                2 -> url_str = "https://schsnd.medu.ir/"
                3 -> url_str = "https://m1-snd.medu.ir/"
                4 -> url_str = "https://m2-snd.medu.ir/"
                5 -> url_str = "http://hamgam.medu.ir/portal/home.php?r=login"
                6 -> url_str = "https://edu.medu.ir"
                7 -> url_str = "https://final2.medu.ir"

            }
            val url = Uri.parse(url_str)
            val intentWeb = Intent(Intent.ACTION_VIEW, url)
            //if(intentWeb.resolveActivity(root.packageManager) != null){ startActivity(intentWeb) }
            startActivity(intentWeb)
        }
        return root

    }


}
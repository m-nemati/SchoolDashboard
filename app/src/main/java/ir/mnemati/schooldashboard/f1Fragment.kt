package ir.mnemati.schooldashboard

import android.app.Activity
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
            DataModel("سناد پیش دبستان", "mns"),
            DataModel("سناد ابتدایی", "mns"),
            DataModel("سناد متوسطه اول", "mns"),
            DataModel("سناد متوسطه دوم", "mns")
        )

      //  val lvAdapter = ArrayAdapter<String>(root.context,android.R.layout.simple_list_item_1,listData)
        val lvAdapter = CustomAdapter(listData)

        val lv_f1:ListView = root.findViewById(R.id.lv_f1)
        lv_f1.adapter = lvAdapter

        lv_f1.setOnItemClickListener { _, _, position, _ ->

            //Toast.makeText(activity, "${listData[position]}", Toast.LENGTH_SHORT).show()
            Toast.makeText(activity, "در نسخه پولی سایت باز می شود :)", Toast.LENGTH_SHORT).show()
        }

        return root

    }


}
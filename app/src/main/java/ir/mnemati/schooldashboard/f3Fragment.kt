package ir.mnemati.schooldashboard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.lang.Exception


class f3Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root3 = inflater.inflate(R.layout.f3_fragment, container,false)

        val devApps:Button = root3.findViewById(R.id.btn_devApps)

        devApps.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("bazaar://collection?slug=by_author&aid=921367227973")
            try {
                intent.setPackage("com.farsitel.bazaar")
                startActivity(intent)
            }
            catch (ex:Exception){
                Toast.makeText(activity, "برای مشاهده برنامه کافه بازار باید نصب گردد.", Toast.LENGTH_SHORT).show()
            }
        }

        return root3

    }
}
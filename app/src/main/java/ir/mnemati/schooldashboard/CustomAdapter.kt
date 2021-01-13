package ir.mnemati.schooldashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class CustomAdapter(private val data:List<DataModel>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.listview_temp, null)

        val data1 = getItem(position)

        val img_sites:CircleImageView = view.findViewById(R.id.img_sites)
        val tv_sites:TextView = view.findViewById(R.id.tv_sites)
        val tv_url:TextView = view.findViewById(R.id.tv_url)
        val tv_expo:TextView = view.findViewById(R.id.tv_expo)

        val id = parent.context.resources.getIdentifier(data1.img, "drawable", parent.context.packageName)
        img_sites.setImageResource(id)

        tv_sites.text = data1.name
        tv_url.text = data1.url
        tv_expo.text = data1.expo

        return view
    }

    override fun getItem(position: Int): DataModel = data[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = data.size
}
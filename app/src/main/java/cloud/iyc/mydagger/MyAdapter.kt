package cloud.iyc.mydagger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter constructor(private val list: ArrayList<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.repo_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        if (list.isNotEmpty()) {
            holder.bind(list[position])
        }
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViewHolder constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        private val textView: TextView = itemView.findViewById(R.id.repoTitle)
        private val textView1: TextView = itemView.findViewById(R.id.reposubTitle)


        fun bind(s: String) {
            textView.text = s
        }

    }
}

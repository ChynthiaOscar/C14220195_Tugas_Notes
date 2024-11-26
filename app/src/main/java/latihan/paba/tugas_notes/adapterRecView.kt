package latihan.paba.tugas_notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterRecView (private val listNotes : ArrayList<notes>) : RecyclerView.Adapter<adapterRecView.ListViewHolder>() {
    inner class  ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var _title = itemView.findViewById<TextView>(R.id.notesTitle)
        var _date = itemView.findViewById<TextView>(R.id.notesDate)
        var _note = itemView.findViewById<TextView>(R.id.notesText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNotes.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val notes = listNotes[position]
        holder._title.setText(notes.title)
        holder._date.setText(notes.date)
        holder._note.setText(notes.note)
    }
}
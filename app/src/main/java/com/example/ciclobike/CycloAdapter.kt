package com.example.ciclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*(2)Heredando la clase desde la clase INTERNA*/
class CycloAdapter (private val listadoCiclos:MutableList<Ciclovia>): RecyclerView.Adapter<CycloAdapter.TARGETCycloViewHolder>(){


    /*(1)Esqueleto del RECYCLEDVIEW*/
inner class TARGETCycloViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    /*Encontrar los LAYOUT dibujados con el objeto planteado en el codigo*/
    var enlaceCycloTextView : TextView= itemView.findViewById(R.id.ciclo_tvw)
    var enlaceComunaTextView : TextView= itemView.findViewById(R.id.comuna_tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TARGETCycloViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cyclo_list, parent,false)//[2] INFLANDO LOS ITEMS A MOSTRAR, desde donde se va a parar, el contexto, y qué se mostrara
        return TARGETCycloViewHolder(view)           //Finalemnte se utiliza el view inflado como salida
    }

    override fun getItemCount(): Int {
       return listadoCiclos.size                                              // [1] primer paso luego de hacer el esqueleto, para saber cuantos elementos va a mostrar
    }

    override fun onBindViewHolder(holder: TARGETCycloViewHolder, position: Int) {  // [3] UNION DE LOS DATOS POR POSICION, va a atar los elementos contados arriba para ser mostrados
        holder.enlaceComunaTextView.text = listadoCiclos[position].comuna
        holder.enlaceCycloTextView.text=listadoCiclos[position].nombre
    }


}
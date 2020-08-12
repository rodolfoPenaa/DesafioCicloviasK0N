package com.example.ciclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class CycloAdapter (private val listadoCiclos:MutableList<Ciclovia>): RecyclerView.Adapter<CycloAdapter.CycloViewHolder>() {


    /*(1)Esqueleto del RECICLEDVIEW*/
    class CycloViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    /*Encontrar los LAYOUT dibujados con el objeto planteado en el codigo*/
    var enlaceCycloTv : TextView= itemView.findViewById(R.id.ciclo_tvw)
    var enlaceComuna : TextView= itemView.findViewById(R.id.comuna_tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycloViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cyclo_list, parent,false)   //INFLANDO LOS ITEMS A MOSTRAR
        return CycloViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listadoCiclos.size                                              // primer paso luego de hacer el esqueleto
    }

    override fun onBindViewHolder(holder: CycloViewHolder, position: Int) {  // UNION DE LOS DATOS POR POSICION, va a atar los elementos contados arriba para ser mostrados
        holder.enlaceComuna.text = listadoCiclos[position].comuna
        holder.enlaceCycloTv.text=listadoCiclos[position].nombre
    }


}
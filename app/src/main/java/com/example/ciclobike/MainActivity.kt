package com.example.ciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cycloAdapter: CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var mDataset:MutableList<Ciclovia>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val setUPciclovia = SetupCiclovias()
        Log.e("FIRST CHANCE", setUPciclovia.toString())
        Log.e("SECOND CHANCE", setUPciclovia.toString())

        setContentView((R.layout.activity_main))

        layoutManager= LinearLayoutManager(this)
        cycloAdapter= CycloAdapter(SetupCiclovias().init() as MutableList<Ciclovia>)
        cycloAdapter=CycloAdapter(mDataset)
        recyclerView= findViewById(R.id.recicledrecicledrecicled)
        recyclerView.adapter=cycloAdapter
        recyclerView.layoutManager=layoutManager



    }
}


//    val click = View.OnClickListener {
//                view ->  when(view.id) {
//                    R.id.filtro -> vistaLista.adapter = CicloviaAdapter(LISTA.filter { x -> x.comuna == "Las Condes"} as ArrayList<Ciclovia>)
//                    R.id.sinfiltro -> vistaLista.adapter = CicloviaAdapter(LISTA)
//                }
//        }
package com.example.ciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ciclobike.dummy.CicloviasFragment

class MainActivity : AppCompatActivity() {
    // 1
    private val setUPciclovia = SetupCiclovias()

    // 2
    private lateinit var recyclerView: RecyclerView
    private lateinit var cycloAdapter: CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var mDataset:MutableList<Ciclovia>
    private lateinit var lascondesBUTON : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// 1
        Log.e("FIRST CHANCE", setUPciclovia.init().toString())

        Log.e("SECOND CHANCE", setUPciclovia.init1().toString())



// 2
        recyclerView= findViewById(R.id.recicledrecicledrecicled)

        layoutManager= LinearLayoutManager(this)

        cycloAdapter= CycloAdapter(SetupCiclovias().init() as MutableList<Ciclovia>)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = cycloAdapter

        lascondesBUTON = findViewById(R.id.button)

        lascondesBUTON.setOnClickListener(View.OnClickListener {

            Toast.makeText(this, "LASCONDES", Toast.LENGTH_LONG).show()



        })

    }

    fun instanceFragment (setupCiclovias: SetupCiclovias){
        var cicloviaSELECTED : CicloviasFragment = CicloviasFragment.newInstance(())
    }

}


//    val click = View.OnClickListener {
//                view ->  when(view.id) {
//                    R.id.filtro -> vistaLista.adapter = CicloviaAdapter(LISTA.filter { x -> x.comuna == "Las Condes"} as ArrayList<Ciclovia>)
//                    R.id.sinfiltro -> vistaLista.adapter = CicloviaAdapter(LISTA)
//                }
//        }
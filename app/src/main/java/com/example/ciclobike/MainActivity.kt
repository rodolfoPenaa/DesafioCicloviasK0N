package com.example.ciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    // 1
    private val setUPciclovia = SetupCiclovia()
    // 2
    private lateinit var recyclerView: RecyclerView
    private lateinit var cycloAdapter: CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var mDataset:MutableList<Ciclovia>
    //3
    private lateinit var lascondesBUTON : Button
    private lateinit var lascondesimagebutton : ImageButton
    //4
    private lateinit var spinnerBIKEway : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// 1
        Log.e("FIRST CHANCE", setUPciclovia.init().toString())
        Log.e("SECOND CHANCE", setUPciclovia.init1().toString())

// 2
        recyclerView = findViewById(R.id.recicledrecicledrecicled)
        layoutManager = LinearLayoutManager(this)
        cycloAdapter = CycloAdapter(SetupCiclovia().init() as MutableList<Ciclovia>)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = cycloAdapter

        lascondesBUTON = findViewById(R.id.button)
        lascondesBUTON.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "LASCONDES", Toast.LENGTH_LONG).show()
        })

        button2.setOnClickListener {
            recyclerView = findViewById(R.id.recicledrecicledrecicled)
            layoutManager = LinearLayoutManager(this)
            cycloAdapter = CycloAdapter(SetupCiclovia().init() as MutableList<Ciclovia>)
            recyclerView.layoutManager = layoutManager
            recyclerView.adapter = cycloAdapter
        }
// 3
            lascondesimagebutton = findViewById(R.id.buttonLASCONDES)

            Picasso.get().load("https://www.lascondes.cl/images/general/logo-las-condes.png")
                .into(lascondesimagebutton)


// 4
     //   spinnerBIKEway

        }

    }














   // fun instanceFragment (setupCiclovias: SetupCiclovias){
   //     var cicloviaSELECTED : CicloviasFragment = CicloviasFragment.newInstance(())
   // }

//}


//    val click = View.OnClickListener {
//                view ->  when(view.id) {
//                    R.id.filtro -> vistaLista.adapter = CicloviaAdapter(LISTA.filter { x -> x.comuna == "Las Condes"} as ArrayList<Ciclovia>)
//                    R.id.sinfiltro -> vistaLista.adapter = CicloviaAdapter(LISTA)
//                }
//        }
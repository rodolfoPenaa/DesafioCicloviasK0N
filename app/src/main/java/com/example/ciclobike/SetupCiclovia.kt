package com.example.ciclobike

class SetupCiclovia{
    private val nombres = arrayOf(
        "Ciclovia 1",
        "Ciclovia 2",
        "Ciclovia 3",
        "Ciclovia 4",
        "Ciclovia 5",
        "Ciclovia 6",
        "Ciclovia 7",
        "Ciclovia 8",
        "Ciclovia 9",
        "Ciclovia 10"
    )
    private val comunas = arrayOf(
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia",
        "Las Condes",
        "La Reina",
        "Ñuñoa",
        "Macul",
        "Providencia"
    )

    fun init(): List<Ciclovia> {
    val listaCiclovias: MutableList<Ciclovia> = ArrayList()
        for (i in 0..9) {
        val cicloviaDETECTED = Ciclovia(nombres[i], comunas[i])
        listaCiclovias.add(cicloviaDETECTED)
        }
    return listaCiclovias
    }

    fun updateComunaSELECTED(): List<Ciclovia> {
        val listaCicloviaSelected: MutableList<Ciclovia> = ArrayList()

        listaCicloviaSelected.filter {

            return listaCicloviaSelected
        }
        return listaCicloviaSelected
    }

        fun init1(): List<Ciclovia> {
            return nombres.zip(comunas) as List<Ciclovia>
        }

        // fun getCOMUNA(): String{
        //cicloviaSELECTED
        //}

    }
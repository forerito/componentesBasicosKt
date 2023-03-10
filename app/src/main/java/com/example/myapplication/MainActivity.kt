package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonComponenetes: Button = findViewById(R.id.button)
        botonComponenetes.setOnClickListener { componenetes() }

    }

    private fun componenetes() {

        val campoNombre: EditText = findViewById(R.id.idNombreText)
        val nombre:String = campoNombre.text.toString()

        var radio1select=""
        var radio2select=""
        var check1select=""
        var check2select=""
        var togglebtnselect=""
        var switchselect=""

        val radio1: RadioButton = findViewById(R.id.radioButton)
        if (radio1.isChecked) {
            radio1select="Radio 1 esta seleccionado"
        } else {
            radio1select="Radio 1 NO esta seleccionado"
        }

        val radio2: RadioButton = findViewById(R.id.radioButton2)
        if (radio2.isChecked) {
            radio2select="Radio 2 esta seleccionado"
        } else {
            radio2select="Radio 2 NO esta seleccionado"
        }

        val check1: CheckBox = findViewById(R.id.checkBox)
        if (check1.isChecked) {
            check1select="Check 1 esta seleccionado"
        } else {
            check1select="Check 1 NO esta seleccionado"
        }
        val check2: CheckBox = findViewById(R.id.checkBox2)
        if (check2.isChecked) {
            check2select="Check 2 esta seleccionado"
        } else {
            check2select="Check 2 NO esta seleccionado"
        }

        val toggleButton: ToggleButton = findViewById(R.id.toggleButton)
        if (toggleButton.isChecked) {
            togglebtnselect="ToggleButton esta seleccionado"
        } else {
            togglebtnselect="ToggleButton NO esta seleccionado"
        }
        val switch: Switch = findViewById(R.id.switch1)
        if (switch.isChecked) {
            switchselect="Switch esta seleccionado"
        } else {
            switchselect="Switch NO esta seleccionado"
        }


        var result="$nombre \n $radio1select \n $radio2select \n $check1select \n $check2select \n $togglebtnselect \n $switchselect"

        Toast.makeText(this,result, Toast.LENGTH_LONG).show()

    }
}
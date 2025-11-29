package com.example.calculadora

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //Exponer todos los IDs de los componentes de las activities
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflar de valores la variable binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        //Despues de esta linea puedo acceder a cada elemento de la vista sin declararlo formalmente
        //Desde aqui

        setListeners()
    }

    private fun setListeners() {
        binding.zeroButton.setOnClickListener(this)
        binding.oneButton.setOnClickListener(this)
        binding.twoButton.setOnClickListener(this)
        binding.threeButton.setOnClickListener(this)
        binding.fourButton.setOnClickListener(this)
        binding.fiveButton.setOnClickListener(this)
        binding.sixButton.setOnClickListener(this)
        binding.sevenButton.setOnClickListener(this)
        binding.eightButton.setOnClickListener(this)
        binding.nineButton.setOnClickListener(this)
        binding.dotButton.setOnClickListener(this)
        binding.deleteButton.setOnClickListener(this)
        binding.acButton.setOnClickListener(this)
        binding.parenthesesButton.setOnClickListener(this)
        binding.percentageButton.setOnClickListener(this)
        binding.splitButton.setOnClickListener(this)
        binding.multiplicationButton.setOnClickListener(this)
        binding.minusButton.setOnClickListener(this)
        binding.plusButton.setOnClickListener(this)
        binding.factorialButton?.setOnClickListener(this)
        binding.squareRootButton?.setOnClickListener(this)
        binding.piButton?.setOnClickListener(this)
        binding.caretButton?.setOnClickListener(this)
        binding.equalButton.setOnClickListener(this)
        binding.calculatorDisplay.setOnClickListener(this)
    }

    private var expression: String? = ""
    private var parenthesesCount = 0
    override fun onClick(v: View?) {
        when (v?.id) {
            binding.zeroButton.id -> appendText("0")
            binding.oneButton.id -> appendText("1")
            binding.twoButton.id -> appendText("2")
            binding.threeButton.id -> appendText("3")
            binding.fourButton.id -> appendText("4")
            binding.fiveButton.id -> appendText("5")
            binding.sixButton.id -> appendText("6")
            binding.sevenButton.id -> appendText("7")
            binding.eightButton.id -> appendText("8")
            binding.nineButton.id -> appendText("9")
            binding.dotButton.id -> appendText(".")

            binding.plusButton.id -> appendText("+")

            binding.minusButton.id -> appendText("-")

            binding.multiplicationButton.id -> appendText("*")

            binding.splitButton.id -> appendText("/")

            binding.percentageButton.id -> appendText("%")

            binding.caretButton?.id -> appendText("^")

            binding.factorialButton?.id -> appendText("!")

            binding.squareRootButton?.id -> appendText("√")

            binding.piButton?.id -> appendText("3.14159")

            binding.parenthesesButton.id -> toggleParenthesis()

            //Boton de borrado general
            binding.acButton.id -> clearButton()

            //Borrar de uno en uno
            binding.deleteButton.id -> deleteLast()

            binding.equalButton.id -> {
                calculate()
            }

        }
    }

    private fun deleteLast() {
        val text = binding.calculatorDisplay.text
        if (text.isNotEmpty()) {
            binding.calculatorDisplay.setText(text.dropLast(1))
            expression = expression?.dropLast(1)
        }
    }

    private fun clearButton() {
        binding.calculatorDisplay.setText("")
        expression = ""
        parenthesesCount = 0
    }

    fun appendText(value: String) {
        expression += value
        binding.calculatorDisplay.setText(expression)
    }

    //Utilizo un parser que analiza el string con los operadores y realiza el calculo

    fun calculate() {
        val fromatedExpression = expression?.replace("%", "/100")
        val e = Expression(fromatedExpression)
        val result = e.calculate()

        if (result.isNaN()) {
            val errorMessage = "Error"
            binding.calculatorDisplay.setText(errorMessage)
        } else {
            // Quitar .0 al final para que no salga “55.0”
            if (result % 1 == 0.0) {
                expression = result.toInt().toString()
                binding.calculatorDisplay.setText(result.toInt().toString())
            } else {
                expression = result.toString()
                binding.calculatorDisplay.setText(result.toString())
            }

            parenthesesCount = 0
        }
    }

    fun toggleParenthesis() {
        //Logica basica para parentesis simples, no permite anidamiento
        if (parenthesesCount == 0) {
            appendText("(")
            parenthesesCount++
        } else {
            appendText(")")
            parenthesesCount = 0
        }
    }
}
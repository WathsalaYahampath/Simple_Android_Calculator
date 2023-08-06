package com.wathsala.android.cal.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import com.wathsala.android.cal.R

class MainFragment : Fragment() {


    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var view = inflater.inflate(R.layout.fragment_main, container, false)
        var message = view.findViewById<TextView>(R.id.message)

        val number1EditText = view.findViewById<EditText>(R.id.number1)
        val number2EditText = view.findViewById<EditText>(R.id.number2)

         message.text =viewModel.result.value.toString()

        viewModel.result.observe(viewLifecycleOwner, Observer { message.text=it.toString()})

        var addButton= view.findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener(){
            var number1 = number1EditText?.text.toString().toDoubleOrNull()
            var number2 = number2EditText?.text.toString().toDoubleOrNull()
            if (number1 != null) {
                if (number2 != null) {
                    viewModel.add(number1 ,number2)
                }
            }
        }

        var divideButton= view.findViewById<Button>(R.id.divideButton)
        divideButton.setOnClickListener(){
            var number1 = number1EditText?.text.toString().toDoubleOrNull()
            var number2 = number2EditText?.text.toString().toDoubleOrNull()
            if (number1 != null) {
                if (number2 != null) {
                    viewModel.divide(number1 ,number2)
                }
            }
        }

        var multiplyButton= view.findViewById<Button>(R.id.minButton)
        multiplyButton.setOnClickListener(){
            var number1 = number1EditText?.text.toString().toDoubleOrNull()
            var number2 = number2EditText?.text.toString().toDoubleOrNull()
            if (number1 != null) {
                if (number2 != null) {
                    viewModel.multiply(number1 ,number2)
                }
            }
        }

        var minButton= view.findViewById<Button>(R.id.minButton)
        minButton.setOnClickListener(){
            var number1 = number1EditText?.text.toString().toDoubleOrNull()
            var number2 = number2EditText?.text.toString().toDoubleOrNull()
            if (number1 != null) {
                if (number2 != null) {
                    viewModel.min(number1 ,number2)
                }
            }
        }
        return view
    }
}
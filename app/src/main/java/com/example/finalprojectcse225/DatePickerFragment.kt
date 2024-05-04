package com.example.finalprojectcse225

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.Toast
import java.util.Calendar
import com.example.finalprojectcse225.databinding.FragmentDatePickerBinding

class DatePickerFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val datePicker = view?.findViewById<DatePicker>(R.id.datePicker)
        val today = Calendar.getInstance()
        datePicker?.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)

        ) { view, year, month, day ->
            val month = month + 1
            val msg = "You Selected: $day/$month/$year"
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_date_picker, container, false)
        return view
    }

    companion object {

    }
}
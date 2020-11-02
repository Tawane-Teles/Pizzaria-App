package br.com.aneteles.pizzariaapp.ui.pizza

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import br.com.aneteles.pizzariaapp.R

class PizzaFragment : Fragment() {

    private lateinit var pizzaViewModel: PizzaViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        pizzaViewModel =
                ViewModelProviders.of(this).get(PizzaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pizzas, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        pizzaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
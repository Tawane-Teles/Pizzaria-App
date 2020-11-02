package br.com.aneteles.pizzariaapp.ui.refrigerantes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import br.com.aneteles.pizzariaapp.R

class RefrigerantesFragment : Fragment() {

    private lateinit var refrigerantesViewModel: RefrigerantesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        refrigerantesViewModel =
                ViewModelProviders.of(this).get(RefrigerantesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_refrigerantes, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        refrigerantesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
package br.com.aneteles.pizzariaapp.ui.lanches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import br.com.aneteles.pizzariaapp.R

class LanchesFragment : Fragment() {

    private lateinit var lanchesViewModel: LanchesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        lanchesViewModel =
                ViewModelProviders.of(this).get(LanchesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_lanches, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        lanchesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
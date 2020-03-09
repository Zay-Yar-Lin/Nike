package com.example.nike

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nike.adapter.NikeAdapter
import com.example.nike.model.Nike
import kotlinx.android.synthetic.main.fragment_nike.view.*

/**
 * A simple [Fragment] subclass.
 */
class nikeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_nike, container, false)
        var nikeArray = ArrayList<Nike>()
        nikeArray.add(Nike(R.drawable.nike_superfly,"Nike Superfly 6","Elite FG",799,"001"))
        nikeArray.add(Nike(R.drawable.nike_air_vapormax,"Air Vapormax","FlyKnit",1280,"002"))
        nikeArray.add(Nike(R.drawable.nike_air_jordan,"Air Jordan 14","Retro Se",2400,"003"))
        nikeArray.add(Nike(R.drawable.nike_one,"LeBron XVI","Low EP",1099,"004"))
        nikeArray.add(Nike(R.drawable.jordan,"Jordan Why Not","Zer0.2 PF",2699,"005"))
        nikeArray.add(Nike(R.drawable.nike_jordan,"LeBron XVI","SB EP",1280,"006"))

        var nikeAdapter = NikeAdapter(nikeArray)
        root.recyclerView.layoutManager = GridLayoutManager(context,2)
        root.recyclerView.adapter = nikeAdapter
        return root
    }

}

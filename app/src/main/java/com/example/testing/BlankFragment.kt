package com.example.testing

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    lateinit var boton1: ExtendedFloatingActionButton
    lateinit var boton2: ExtendedFloatingActionButton
    lateinit var boton3: ExtendedFloatingActionButton
    lateinit var container: FragmentContainerView

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view2= inflater.inflate(R.layout.fragment_blank, container, false)
        comprobarFragment(view2)
        return view2
    }

    fun comprobarFragment(view: View){
        boton1= view.findViewById(R.id.boton1)
        boton2=view.findViewById(R.id.boton2)
        boton3=view.findViewById(R.id.boton3)
        container=view.findViewById(R.id.fragmentContainerView2)
        boton1.setOnClickListener{
            boton1.extend()
            boton1.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#393E46"))
            boton2.shrink()
            boton2.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#000000"))
            boton3.shrink()
            boton3.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#000000"))
            replaceFragment(fragment)
        }
        boton2.setOnClickListener{
            boton2.extend()
            boton2.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#393E46"))
            boton1.shrink()
            boton1.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#000000"))
            boton3.shrink()
            boton3.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#000000"))
        }
        boton3.setOnClickListener{
            boton3.extend()
            boton3.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#393E46"))
            boton1.shrink()
            boton1.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#000000"))
            boton2.shrink()
            boton2.backgroundTintList=ColorStateList.valueOf(Color.parseColor("#000000"))
        }
    }
    fun replaceFragment(fragment: Fragment){

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
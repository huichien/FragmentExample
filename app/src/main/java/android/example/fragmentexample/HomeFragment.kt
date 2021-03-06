package android.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)

        val btnAbout: Button =view.findViewById(R.id.btnAbout)

        btnAbout.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_aboutFragment)
        }
        return view
    }


}
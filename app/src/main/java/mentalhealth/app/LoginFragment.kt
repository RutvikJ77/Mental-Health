package mentalhealth.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_home_page.*

class LoginFragment : Fragment(R.layout.fragment_login), View.OnClickListener {

    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.emergency_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.introCont_btn).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.emergency_btn -> navController!!.navigate(R.id.action_loginFragment_to_emergencyFragment)
            R.id.introCont_btn-> navController!!.navigate(R.id.action_loginFragment_to_introFragment)
        }
    }

}


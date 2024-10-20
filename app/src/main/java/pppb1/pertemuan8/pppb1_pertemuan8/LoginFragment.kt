package pppb1.pertemuan8.pppb1_pertemuan8

import MainActivity2
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        // Button login
        val loginButton: Button = view.findViewById(R.id.login_button)
        val usernameEditText: EditText = view.findViewById(R.id.login_username)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()

            // Intent ke MainActivity2 dan kirim data username
            val intent = Intent(activity, MainActivity2::class.java)
            intent.putExtra("USERNAME_KEY", username)
            startActivity(intent)
        }

        return view
    }
}

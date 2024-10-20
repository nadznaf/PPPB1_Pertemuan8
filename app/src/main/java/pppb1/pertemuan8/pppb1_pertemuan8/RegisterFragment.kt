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

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        // Button register
        val registerButton: Button = view.findViewById(R.id.btn_register)
        val usernameEditText: EditText = view.findViewById(R.id.et_username)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()

            // Intent ke MainActivity2 dan kirim data username
            val intent = Intent(activity, MainActivity2::class.java)
            intent.putExtra("USERNAME_KEY", username)
            startActivity(intent)
        }

        return view
    }
}

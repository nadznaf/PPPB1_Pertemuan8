import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import pppb1.pertemuan8.pppb1_pertemuan8.R

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Get reference to the TextView where the username will be displayed
        val usernameTextView = findViewById<TextView>(R.id.txt_username)

        // Get the username passed from the fragment
        val username = intent.getStringExtra("USERNAME")

        // Display the username if it's not null
        if (username != null) {
            usernameTextView.text = "Welcome, $username!"
        }
    }
}

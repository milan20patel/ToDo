package iut.project.mytodolist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import android.os.Bundle
import android.widget.ToggleButton

class SettingsActivity : AppCompatActivity() {
    private lateinit var darkModeToggle: ToggleButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_settings)

        darkModeToggle = findViewById(R.id.darkModeToggle)

        // Check the current night mode
        val currentNightMode = AppCompatDelegate.getDefaultNightMode()

        // Set the dark mode toggle's state based on the current night mode
        darkModeToggle.isChecked = currentNightMode == AppCompatDelegate.MODE_NIGHT_YES

        darkModeToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Switch to dark mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                // Switch to light mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

            // Recreate the activity to apply the new theme
            recreate()
        }
    }
}

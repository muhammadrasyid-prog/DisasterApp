package com.android.disasterapp

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.disasterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterDisaster = DisasterAdapter(generateDummy()) { disaster ->
            Toast.makeText(this@MainActivity, "You clicked on ${disaster.nameDisaster}", Toast.LENGTH_SHORT).show()
        }

        with(binding) {
            rvDisaster.apply {
                adapter = adapterDisaster
                layoutManager = GridLayoutManager(this@MainActivity, 2)
            }
        }
    }

    fun generateDummy(): List<Disaster> {
        return listOf(
            Disaster(nameDisaster = "Tsunami", disasterType = "Natural", imageRes = R.drawable.img_tsunami),
            Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural", imageRes = R.drawable.img_volcano),
            Disaster(nameDisaster = "Earthquake", disasterType = "Natural", imageRes = R.drawable.img_earthquake),
            Disaster(nameDisaster = "Flood", disasterType = "Natural", imageRes = R.drawable.img_flood),
            Disaster(nameDisaster = "Fire", disasterType = "Natural", imageRes = R.drawable.img_fire),
            Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made", imageRes = R.drawable.img_nuclear),
            Disaster (nameDisaster = "Terrorist Attack", disasterType = "Man-made", imageRes = R.drawable.img_terror),
            Disaster (nameDisaster = "War", disasterType = "Man-made", imageRes = R.drawable.img_war)
        )
    }
}
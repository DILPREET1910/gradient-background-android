package com.example.mad

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var background = findViewById<LinearLayout>(R.id.background)

        var tvSecondColorRGB: TextView = findViewById(R.id.tvSecondColorRGB)
        var tvFirstColorRGB: TextView = findViewById(R.id.tvFirstColorRGB)

        var ivFirstColor: ImageView = findViewById(R.id.ivFirstColor)
        var ivSecondColor: ImageView = findViewById(R.id.ivSecondColor)

        var currentRed1: Int = 0
        var currentRed2: Int = 0
        var currentBlue1: Int = 0
        var currentBlue2: Int = 0
        var currentGreen1: Int = 0
        var currentGreen2: Int = 0

//      RED SEEKBAR
        var redSeekBar1: SeekBar = findViewById(R.id.redSeekBar1)
        var redSeekBar2: SeekBar = findViewById(R.id.redSeekBar2)
        var tvRed: TextView = findViewById(R.id.tvRed)
        redSeekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 0) {
                    tvRed.text = "RED"
                } else {
                    ivFirstColor.setBackgroundColor(Color.rgb(p1, currentGreen1, currentBlue1))
                    currentRed1 = p1
                    tvFirstColorRGB.text = "RGB($currentRed1,$currentGreen1,$currentBlue1,)"
                    background.setBackgroundColor(
                        Color.rgb(
                            currentRed1,
                            currentGreen1,
                            currentBlue1
                        )
                    )
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
        redSeekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 0) {
                    tvRed.text = "RED"
                } else {
                    ivSecondColor.setBackgroundColor(Color.rgb(p1, currentGreen2, currentBlue2))
                    currentRed2 = p1
                    tvSecondColorRGB.text = "RGB($currentRed2,$currentGreen2,$currentBlue2,)"
                    background.setBackgroundColor(
                        Color.rgb(
                            currentRed2,
                            currentGreen2,
                            currentBlue2
                        )
                    )
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

//      GREEN SEEKBAR
        var greenSeekBar1: SeekBar = findViewById(R.id.greenSeekBar1)
        var greenSeekBar2: SeekBar = findViewById(R.id.greenSeekBar2)
        var tvGreen: TextView = findViewById(R.id.tvGreen)
        greenSeekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 0) {
                    tvGreen.text = "GREEN"
                } else {
                    ivFirstColor.setBackgroundColor(Color.rgb(currentRed1, p1, currentBlue1))
                    currentGreen1 = p1
                    tvFirstColorRGB.text = "RGB($currentRed1,$currentGreen1,$currentBlue1,)"
                    background.setBackgroundColor(
                        Color.rgb(
                            currentRed1,
                            currentGreen1,
                            currentBlue1
                        )
                    )
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
        greenSeekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 0) {
                    tvGreen.text = "GREEN"
                } else {
                    ivSecondColor.setBackgroundColor(Color.rgb(currentRed2, p1, currentBlue2))
                    currentGreen2 = p1
                    tvSecondColorRGB.text = "RGB($currentRed2,$currentGreen2,$currentBlue2,)"
                    background.setBackgroundColor(
                        Color.rgb(
                            currentRed2,
                            currentGreen2,
                            currentBlue2
                        )
                    )
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

//      BLUE SEEKBAR
        var blueSeekBar1: SeekBar = findViewById(R.id.blueSeekBar1)
        var blueSeekBar2: SeekBar = findViewById(R.id.blueSeekBar2)
        var tvBlue: TextView = findViewById(R.id.tvBlue)
        blueSeekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 0) {
                    tvBlue.text = "BLUE"
                } else {
                    ivFirstColor.setBackgroundColor(Color.rgb(currentRed1, currentGreen1, p1))
                    currentBlue1 = p1
                    tvFirstColorRGB.text = "RGB($currentRed1,$currentGreen1,$currentBlue1,)"
                    background.setBackgroundColor(
                        Color.rgb(
                            currentRed1,
                            currentGreen1,
                            currentBlue1
                        )
                    )
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
        blueSeekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 0) {
                    tvBlue.text = "BLUE"
                } else {
                    ivSecondColor.setBackgroundColor(Color.rgb(currentRed2, currentGreen2, p1))
                    currentBlue2 = p1
                    tvSecondColorRGB.text = "RGB($currentRed2,$currentGreen2,$currentBlue2,)"
                    background.setBackgroundColor(
                        Color.rgb(
                            currentRed2,
                            currentGreen2,
                            currentBlue2
                        )
                    )
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

    }


}
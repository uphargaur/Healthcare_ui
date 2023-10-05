package com.arima.humors_tech_figma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Graphactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graphactivity)


//        val lineChart = findViewById<LineChart>(R.id.lineChart)
//
//        val entries = ArrayList<Entry>()
//
//        // Dummy data for the chart
//        val dummyData = arrayOf(
//            20f, 40f, 60f, 80f, 100f, 70f, 50f, 30f, 10f, 50f, 90f, 70f
//        )
//
//        for (i in dummyData.indices) {
//            entries.add(Entry(i.toFloat(), dummyData[i]))
//        }
//
//        val dataSet = LineDataSet(entries, "Dummy Data")
//        dataSet.color = Color.BLUE
//        dataSet.setDrawFilled(true)
//        dataSet.fillColor = Color.BLUE
//        dataSet.fillAlpha = 150
//        dataSet.mode = LineDataSet.Mode.CUBIC_BEZIER
//
//        val dataSets: ArrayList<ILineDataSet> = ArrayList()
//        dataSets.add(dataSet)
//
//        val data = LineData(dataSets)
//
//        lineChart.data = data
//
//        // Customize chart appearance
//        lineChart.description = Description().apply { text = "" }
//        lineChart.xAxis.labelRotationAngle = -45f
//        lineChart.xAxis.setDrawGridLines(false)
//        lineChart.axisLeft.axisMinimum = 0f
//        lineChart.axisLeft.axisMaximum = 100f
//        lineChart.axisRight.isEnabled = false
//        lineChart.legend.isEnabled = false
//        lineChart.setTouchEnabled(true)
//        lineChart.setPinchZoom(true)
//
//        // Refresh the chart
//        lineChart.invalidate()
    }
}
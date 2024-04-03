package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.task.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {

//    val binding by lazy {
//
//        ActivityMainBinding.inflate(layoutInflater)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                var discription:TextView=findViewById(R.id.discription)
        var Bname:TextView=findViewById(R.id.brandname2)


val ws= retrofitBuilder.getInstance().create(ApiInterface::class.java)

        val retrofitData=ws.getData()



        retrofitData.enqueue(object : Callback<Data?> {
            override fun onResponse(p0: Call<Data?>, p1: Response<Data?>) {
                val responseBody= p1.body()!!



                Bname.text=responseBody.brand_name

            }

            override fun onFailure(p0: Call<Data?>, p1: Throwable) {
                discription.text= p1.localizedMessage?.toString()
            }


        })




    }
}
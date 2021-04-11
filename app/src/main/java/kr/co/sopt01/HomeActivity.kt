package kr.co.sopt01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.sopt01.databinding.ActivityHomeBinding
import kr.co.sopt01.databinding.ActivitySignInBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var userID:String = binding.userid.text.toString()
        var userName:String = binding.username.text.toString()
     //이렇게 해서 intent로 넣져있는 값을 넣고 싶었는데 안들어갔음
         var useriD = intent.getStringExtra("userID").toString()
         userName = intent.getStringExtra("userName").toString()




    }
    override fun onStart() {
        super.onStart()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)

    }
    override fun onResume() {
        super.onResume()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

    override fun onPause() {
        super.onPause()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

    override fun onStop() {
        super.onStop()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

    override fun onDestroy() {
        super.onDestroy()
        val functionName = object{}.javaClass.enclosingMethod.name
        Log.d("functionName",functionName)
    }

}
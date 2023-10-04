package com.example.test

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.test.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val container = findViewById<LinearLayout>(R.id.container)
        val fragmentContainer = findViewById<FrameLayout>(R.id.frameLayout)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(fragmentContainer.id, MusicFragment())
        fragmentTransaction.commit()

        // Add buttons or image views for your fragments
        val selectMusicBtn = findViewById<Button>(R.id.selectMusciBtn)
        val recordBtn = findViewById<Button>(R.id.recordBtn)
        val metBtn = findViewById<Button>(R.id.metBtn)
        selectMusicBtn.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(fragmentContainer.id, MusicFragment())
            fragmentTransaction.commit()
            selectMusicBtn.setTextColor(ContextCompat.getColor(this, R.color.main))
            recordBtn.setTextColor(ContextCompat.getColor(this,R.color.white))
            metBtn.setTextColor(ContextCompat.getColor(this,R.color.white))
        }
        recordBtn.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(fragmentContainer.id, HomeFragment())
            fragmentTransaction.commit()

            selectMusicBtn.setTextColor(ContextCompat.getColor(this, R.color.white))
            recordBtn.setTextColor(ContextCompat.getColor(this,R.color.main))
            metBtn.setTextColor(ContextCompat.getColor(this,R.color.white))
        }
        metBtn.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(fragmentContainer.id, HomeFragment())
            fragmentTransaction.commit()

            selectMusicBtn.setTextColor(ContextCompat.getColor(this, R.color.white))
            recordBtn.setTextColor(ContextCompat.getColor(this,R.color.white))
            metBtn.setTextColor(ContextCompat.getColor(this,R.color.main))
        }

        // Repeat the above code for each fragment you want to display

//        val myButton: Button = findViewById(R.id.button)

//        // 파일권한얻기
//        // 출처:https://devforyou.tistory.com/57
//        myButton.setOnClickListener {
//            Log.d("PermissionCheck", "Before permission check")
//
//            val permissionCheck = ContextCompat.checkSelfPermission(
//                this,
//                android.Manifest.permission.READ_EXTERNAL_STORAGE
//            )
//            when (permissionCheck) {
//                PackageManager.PERMISSION_GRANTED -> {
//                    // READ_EXTERNAL_STORAGE의 권한이 PERMISSION_GRANTED와 같다면..
//                    //TODO 권한이 잘 부여되었을 때상황, 파일 선택하는 코드 구현
//                    Log.d("PermissionCheck", "Permission granted")
//                    getMP3File()
//                }
//
//                else -> {
//                    if(shouldShowRequestPermissionRationale(android.Manifest.permission.MANAGE_EXTERNAL_STORAGE)){
//                        showPermissionContextPopup()
//                    }
//                    // 파일 읽기 권한 얻기 요청
//                    requestPermissions(
//                        arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
//                        1000
//                    )
//                }
//            }
//
//        }
    }

    private fun getMP3File() {
        Log.d("getMP3File", "getMP3File start")
    }

    private fun showPermissionContextPopup() {
        AlertDialog.Builder(this)
            .setTitle("권한이 필요합니다")
            .setMessage("기기에서 음원파일을 선택하려면 권한이 필요합니다.")
            .setPositiveButton("동의하기", { _, _ ->
                requestPermissions(arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE), 1000)
            })
            .setNegativeButton("취소하기", { _, _ -> })
            .create()
            .show()
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        println(PackageManager.PERMISSION_GRANTED)
        println(grantResults.isNotEmpty())
        println(grantResults.get(0))
        when (requestCode) {
            1000 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // 권한이 부여 된 것입니다.
                    // 허용 클릭 시
                    getMP3File()
                } else {
                    // 거부 클릭시
                    Log.d("PermissionCheck", "Permission not granted")
                    Toast.makeText(this, "권한을 거부했습니다.", Toast.LENGTH_SHORT).show()
                }
            }

            else -> {
                //Do Nothing
            }
        }
    }
}


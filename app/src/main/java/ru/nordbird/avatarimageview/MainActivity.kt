package ru.nordbird.avatarimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import ru.nordbird.avatarimageview.ui.AvatarImageView

class MainActivity : AppCompatActivity() {

//    private val stId = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
//        val view = AvatarImageView(this).apply {
//            id = stId
//            layoutParams = LinearLayout.LayoutParams(120, 120)
//            setImageResource(R.drawable.ava_big)
//        }
//
//        container.addView(view)

        btn_border.setOnClickListener {
            aiv_avatar.setBorderWidth((2..10).random())
        }

        btn_color.setOnClickListener {
            aiv_avatar.setBorderColor((AvatarImageView.bgColors).random())
        }
    }
}

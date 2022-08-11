package np.com.learnmui3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //change background color
        elevatedButton.setBackgroundColor(ContextCompat.getColor(this,R.color.black))
    }
}
//class IamJustCreatedToObtainOOPparadigm {
//
//}
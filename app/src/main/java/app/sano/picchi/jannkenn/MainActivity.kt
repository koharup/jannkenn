package app.sano.picchi.jannkenn

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun guu (view: View){
        playerText.text = "あなたの手はぐーです"
        val number = Random.nextInt(3)

        when(number){
            0 -> {
                imageView.setImageResource(R.drawable.guu)
                resultText.text = "引き分けです"
                resultText.setTextColor(Color.rgb(0,0,0))
            }

            1 ->{
                imageView.setImageResource(R.drawable.cyoki)
                resultText.text = "あなたの勝ちです"
                resultText.setTextColor(Color.rgb(250,0,100))
            }

            2 ->{
                imageView.setImageResource(R.drawable.paa)
                resultText.text = "あなたの負けです"
                resultText.setTextColor(Color.rgb(0,0,0))

            }
        }
    }

    fun cyoki(view: View){
        playerText.text = "あなたの手はちょきです"
        var number = Random.nextInt(3)

        when(number){
            0 -> {
                imageView.setImageResource(R.drawable.guu)
                resultText.text = "あなたの負けです"
                resultText.setTextColor(Color.rgb(0,0,0))
            }
            1 ->{
                imageView.setImageResource(R.drawable.cyoki)
                resultText.text = "引き分けです"
                resultText.setTextColor(Color.rgb(0,0,0))
            }
            2 ->{
                imageView.setImageResource(R.drawable.paa)
                resultText.text = "あなたの勝ちです"
                resultText.setTextColor(Color.rgb(250,0,100))
            }

        }

    }
    fun paa(view: View){
        playerText.text = "あなたの手はパーです"
        var number = Random.nextInt(3)
        when(number){
            0 -> {
                imageView.setImageResource(R.drawable.guu)
                resultText.text = "あなたの勝ちです"
                resultText.setTextColor(Color.rgb(250,0,100))
            }
            1 ->{
                imageView.setImageResource(R.drawable.cyoki)
                resultText.text = "あなたの負けです"
                resultText.setTextColor(Color.rgb(0,0,0))
            }
            2 ->{
                imageView.setImageResource(R.drawable.paa)
                resultText.text = "引き分けです"
                resultText.setTextColor(Color.rgb(0,0,0))
            }
        }

    }
}

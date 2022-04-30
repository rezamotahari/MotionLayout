package academy.nouri.motionlayoutcourse.menu_vertical

import academy.nouri.motionlayoutcourse.R
import academy.nouri.motionlayoutcourse.databinding.ActivityMenuVerticalBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MenuVerticalActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityMenuVerticalBinding

    private var isMenuOpened = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menu1Txt.setOnClickListener {
            if (isMenuOpened) {
                binding.motionLayout.setTransition(R.id.state2, R.id.state1)
            } else {
                binding.motionLayout.setTransition(R.id.state1, R.id.state2)
            }
            binding.motionLayout.transitionToEnd()

            isMenuOpened = !isMenuOpened
        }

        binding.menu2Txt.setOnClickListener {
            if (isMenuOpened) {
                binding.motionLayout.setTransition(R.id.state3, R.id.state1)
            } else {
                binding.motionLayout.setTransition(R.id.state1, R.id.state3)
            }
            binding.motionLayout.transitionToEnd()

            isMenuOpened = !isMenuOpened
        }

        binding.menu3Txt.setOnClickListener {
            if (isMenuOpened) {
                binding.motionLayout.setTransition(R.id.state4, R.id.state1)
            } else {
                binding.motionLayout.setTransition(R.id.state1, R.id.state4)
            }
            binding.motionLayout.transitionToEnd()

            isMenuOpened = !isMenuOpened
        }
    }
}
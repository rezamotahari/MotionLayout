package academy.nouri.motionlayoutcourse.houses_images3

import academy.nouri.motionlayoutcourse.R
import academy.nouri.motionlayoutcourse.databinding.ActivityHousesImages3Binding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HousesImages3Activity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityHousesImages3Binding

    //Other
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHousesImages3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.img1.setOnClickListener {
            if (index == 0) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.state_img2, R.id.state_img1)
            binding.motionLayout.transitionToEnd()

            index = 0
        }

        binding.img2.setOnClickListener {
            if (index == 1) return@setOnClickListener

            if (index == 2) {
                binding.motionLayout.setTransition(R.id.state_img3, R.id.state_img2)
            } else {
                binding.motionLayout.setTransition(R.id.state_img1, R.id.state_img2)
            }
            binding.motionLayout.transitionToEnd()

            index = 1
        }

        binding.img3.setOnClickListener {
            if (index == 2) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.state_img2, R.id.state_img3)
            binding.motionLayout.transitionToEnd()

            index = 2
        }
    }
}
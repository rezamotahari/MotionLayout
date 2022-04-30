package academy.nouri.motionlayoutcourse.loading_button

import academy.nouri.motionlayoutcourse.R
import academy.nouri.motionlayoutcourse.databinding.ActivityLoadingButtonBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.postDelayed

class LoadingButtonActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityLoadingButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.materialButton.setOnClickListener {
            binding.motionLayout.transitionToState(R.id.loading_end)

            it.postDelayed(3000){
                binding.motionLayout.transitionToState(R.id.downloaded)
            }
        }
    }
}
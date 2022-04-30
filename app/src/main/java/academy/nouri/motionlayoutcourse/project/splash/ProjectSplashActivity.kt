package academy.nouri.motionlayoutcourse.project.splash

import academy.nouri.motionlayoutcourse.R
import academy.nouri.motionlayoutcourse.databinding.ActivityProjectSplashBinding
import academy.nouri.motionlayoutcourse.project.home.ProjectHomeActivity
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout

@SuppressLint("CustomSplashScreen")
class ProjectSplashActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityProjectSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Auto run
        binding.splashMotionLayout.transitionToState(R.id.end)
        //Start home page
        binding.splashMotionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {

            }

            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                startActivity(Intent(this@ProjectSplashActivity, ProjectHomeActivity::class.java))
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }

            override fun onTransitionTrigger(motionLayout: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {

            }

        })

    }
}
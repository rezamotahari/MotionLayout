package academy.nouri.motionlayoutcourse

import academy.nouri.motionlayoutcourse.big_header.BigHeaderActivity
import academy.nouri.motionlayoutcourse.check_list.CheckListActivity
import academy.nouri.motionlayoutcourse.databinding.ActivityMenu2Binding
import academy.nouri.motionlayoutcourse.databinding.ActivityProjectsListBinding
import academy.nouri.motionlayoutcourse.drawer_menu.DrawerMenuActivity
import academy.nouri.motionlayoutcourse.expandable.ExpandableActivity
import academy.nouri.motionlayoutcourse.houses.HousesActivity
import academy.nouri.motionlayoutcourse.houses_images.HousesImagesActivity
import academy.nouri.motionlayoutcourse.houses_images2.HousesImages2Activity
import academy.nouri.motionlayoutcourse.houses_images3.HousesImages3Activity
import academy.nouri.motionlayoutcourse.instagram_story.StoryActivity
import academy.nouri.motionlayoutcourse.loading_button.LoadingButtonActivity
import academy.nouri.motionlayoutcourse.lock_screen.LockScreenActivity
import academy.nouri.motionlayoutcourse.login.LoginActivity
import academy.nouri.motionlayoutcourse.menu.MenuActivity
import academy.nouri.motionlayoutcourse.menu_2.Menu2Activity
import academy.nouri.motionlayoutcourse.menu_vertical.MenuVerticalActivity
import academy.nouri.motionlayoutcourse.movie.MovieActivity
import academy.nouri.motionlayoutcourse.movie_2.MovieAppActivity
import academy.nouri.motionlayoutcourse.movie_card_3d.MovieCard3DActivity
import academy.nouri.motionlayoutcourse.profile.ProfileActivity
import academy.nouri.motionlayoutcourse.profile2.Profile2Activity
import academy.nouri.motionlayoutcourse.project.splash.ProjectSplashActivity
import academy.nouri.motionlayoutcourse.searchbox.SearchBoxActivity
import academy.nouri.motionlayoutcourse.snapchat.SnapChatActivity
import academy.nouri.motionlayoutcourse.splash.SplashActivity
import academy.nouri.motionlayoutcourse.telegram.TelegramActivity
import academy.nouri.motionlayoutcourse.youtube.YoutubeActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityProjectsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            project1Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, MovieActivity::class.java))
            }
            project2Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            }
            project3Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, HousesActivity::class.java))
            }
            project4Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, BigHeaderActivity::class.java))
            }
            project5Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, SplashActivity::class.java))
            }
            project6Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, SearchBoxActivity::class.java))
            }
            project7Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
            }
            project8Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, LockScreenActivity::class.java))
            }
            project9Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, HousesImagesActivity::class.java))
            }
            project10Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, StoryActivity::class.java))
            }
            project11Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, MenuActivity::class.java))
            }
            project12Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, CheckListActivity::class.java))
            }
            project13Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, TelegramActivity::class.java))
            }
            project14Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, HousesImages2Activity::class.java))
            }
            project15Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, MenuVerticalActivity::class.java))
            }
            project16Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, HousesImages3Activity::class.java))
            }
            project17Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, DrawerMenuActivity::class.java))
            }
            project18Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, ExpandableActivity::class.java))
            }
            project19Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, LoadingButtonActivity::class.java))
            }
            project20Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, MovieAppActivity::class.java))
            }
            project21Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, Menu2Activity::class.java))
            }
            project22Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, YoutubeActivity::class.java))
            }
            project23Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, MovieCard3DActivity::class.java))
            }
            project24Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, Profile2Activity::class.java))
            }
            project25Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, SnapChatActivity::class.java))
            }
            project26Btn.setOnClickListener {
                startActivity(Intent(this@MainActivity, ProjectSplashActivity::class.java))
            }
        }
    }
}
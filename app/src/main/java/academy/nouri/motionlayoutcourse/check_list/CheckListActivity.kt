package academy.nouri.motionlayoutcourse.check_list

import academy.nouri.motionlayoutcourse.R
import academy.nouri.motionlayoutcourse.databinding.ActivityCheckListBinding
import academy.nouri.motionlayoutcourse.movie.MoviesModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class CheckListActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityCheckListBinding

    //Other
    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { CheckListAdapter(moviesList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Recycler
        addMovies()
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@CheckListActivity)
                adapter = moviesAdapter
            }
        }
    }
    private fun addMovies() {
        moviesList.add(MoviesModel(1, "تکمیل دوره جامع انیمیشن سازی", R.drawable.ic_round_work_24))
        moviesList.add(MoviesModel(2, "خرید برای خونه", R.drawable.ic_round_shopping_cart_24))
        moviesList.add(MoviesModel(3, "تعمیر کولر", R.drawable.ic_round_home_24))
        moviesList.add(MoviesModel(4, "تماس با محسن", R.drawable.ic_round_call_24))
        moviesList.add(MoviesModel(5, "تعویض روغن ماشین", R.drawable.ic_round_directions_car_24))
        moviesList.add(MoviesModel(6, "تولد محمد", R.drawable.ic_round_celebration_24))
        moviesList.add(MoviesModel(7, "رزرو زمین فوتبال", R.drawable.ic_round_sports_tennis_24))
    }
}
package academy.nouri.motionlayoutcourse.movie_card_3d

import academy.nouri.motionlayoutcourse.R
import academy.nouri.motionlayoutcourse.databinding.ActivityMovieCard3dBinding
import academy.nouri.motionlayoutcourse.movie.MoviesModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MovieCard3DActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityMovieCard3dBinding

    //Other
    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { MoviesAdapter(moviesList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieCard3dBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Recycler
        addMovies()
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@MovieCard3DActivity, LinearLayoutManager.HORIZONTAL, false)
                adapter = moviesAdapter
            }
        }
    }

    private fun addMovies() {
        moviesList.add(MoviesModel(1, "Aquaman", R.drawable.aquaman_poster))
        moviesList.add(MoviesModel(2, "Shang-Chi", R.drawable.shangchi_poster))
        moviesList.add(MoviesModel(3, "Last night in Soho", R.drawable.lastnigh_poster))
        moviesList.add(MoviesModel(4, "Venom: Let There Be Carnage", R.drawable.venum_poster))
    }
}
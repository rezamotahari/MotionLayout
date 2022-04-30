package academy.nouri.motionlayoutcourse.project.detail

import academy.nouri.motionlayoutcourse.R
import academy.nouri.motionlayoutcourse.databinding.ActivityProjectDetailBinding
import academy.nouri.motionlayoutcourse.project.CAR_IMG
import academy.nouri.motionlayoutcourse.project.CAR_NAME
import academy.nouri.motionlayoutcourse.project.CAR_PRICE
import academy.nouri.motionlayoutcourse.project.home.cars.CarsModel
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class ProjectDetailActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityProjectDetailBinding

    //Other
    private val carsAdapter by lazy { DetailCarsAdapter(carsData()) }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Binding
        binding.apply {
            //Get data
            intent.extras?.let {
                detailCarImg.setImageResource(it.getInt(CAR_IMG))
                detailCarName.text = it.getString(CAR_NAME)
                detailRentPrice.text = "$${it.getInt(CAR_PRICE)}"
            }
            //Cars
            detailList.apply {
                layoutManager = LinearLayoutManager(this@ProjectDetailActivity)
                adapter = carsAdapter
            }
        }
    }

    private fun carsData(): MutableList<CarsModel> = arrayListOf(
        CarsModel(R.drawable.car1, 1200, "اسپارتک"),
        CarsModel(R.drawable.car2, 840, "جیپ سفید"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car4, 980, "جیپ آبی")
    )
}
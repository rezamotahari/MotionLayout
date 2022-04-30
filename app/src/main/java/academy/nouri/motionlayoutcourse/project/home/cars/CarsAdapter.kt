package academy.nouri.motionlayoutcourse.project.home.cars

import academy.nouri.motionlayoutcourse.databinding.ItemImagesPostsBinding
import academy.nouri.motionlayoutcourse.databinding.ItemRentCarsBinding
import academy.nouri.motionlayoutcourse.project.CAR_IMG
import academy.nouri.motionlayoutcourse.project.CAR_NAME
import academy.nouri.motionlayoutcourse.project.CAR_PRICE
import academy.nouri.motionlayoutcourse.project.detail.ProjectDetailActivity
import academy.nouri.motionlayoutcourse.project.home.images.ImagesAdapter
import academy.nouri.motionlayoutcourse.project.home.images.ImagesModel
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarsAdapter constructor(private val items: MutableList<CarsModel>) : RecyclerView.Adapter<CarsAdapter.ViewHolder>() {

    private lateinit var binding: ItemRentCarsBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemRentCarsBinding.inflate(inflater, parent, false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(itemView: ItemRentCarsBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(item: CarsModel) {
            binding.apply {
                itemCarsImg.setImageResource(item.img)
                itemCarName.text = item.name
                itemCarPrice.text = item.price.toString()

                root.setOnClickListener {
                    val intent = Intent(context, ProjectDetailActivity::class.java)
                    intent.putExtra(CAR_IMG, item.img)
                    intent.putExtra(CAR_NAME, item.name)
                    intent.putExtra(CAR_PRICE, item.price)
                    context.startActivity(intent)
                }
            }
        }
    }
}
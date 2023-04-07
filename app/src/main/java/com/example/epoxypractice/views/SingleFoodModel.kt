package com.example.epoxypractice.views
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxypractice.R

@EpoxyModelClass(layout = R.layout.food_item)
abstract class SingleFoodModel : EpoxyModelWithHolder<SingleFoodModel.FoodHolder>() {

    @EpoxyAttribute
    @DrawableRes
    var image: Int = 0

    @EpoxyAttribute
    var title: String? = ""

    @EpoxyAttribute
    var desc: String = ""

    override fun bind(holder: FoodHolder) {
        holder.imageView.setImageResource(image)
        holder.titleView.text = title
    }

    inner class FoodHolder : EpoxyHolder() {

        lateinit var imageView: ImageView
        lateinit var titleView: TextView
        lateinit var descView: TextView

        override fun bindView(itemView: View) {
            imageView = itemView.findViewById(R.id.image)
            titleView = itemView.findViewById(R.id.title)
            descView = itemView.findViewById(R.id.desc)
        }
    }
}

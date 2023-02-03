package com.anarchymedia.happybirthdaymom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.helper.widget.Carousel
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment

class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val carousel = view.findViewById<Carousel>(R.id.carousel_helper)

        val drawables = arrayOf(
            R.drawable.image1,
            R.drawable.image2
        )

        carousel.setAdapter(object: Carousel.Adapter{
            override fun count(): Int {
                return drawables.size
            }

            override fun populate(view: View?, index: Int) {
                if(view is ImageView){
                    view.setImageResource(drawables[index])
                }
            }

            override fun onNewItem(index: Int) {

            }

        })

        return view
    }
}
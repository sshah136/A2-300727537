package com.example.a2_300727537

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a2_300727537.databinding.ActivityListingBinding
import com.example.a2_300727537.model.Listing

class ListingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listings = arrayListOf<Listing>()
        for (i in 0..100) {
            listings.add(Listing("Building Listing $i", "Description $i",1.11,"https://placehold.co/600x400"))

        }

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(this@ListingActivity,2)
            adapter = ListingAdapter(listings)
        }
    }

}
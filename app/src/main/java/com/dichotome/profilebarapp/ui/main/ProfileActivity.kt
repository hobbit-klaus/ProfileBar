package com.dichotome.profilebarapp.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.request.RequestOptions
import com.dichotome.profilebar.stubs.fragments.FavouritesTabFragment
import com.dichotome.profilebar.stubs.fragments.SubscriptionsTabFragment
import com.dichotome.profilebar.ui.tabPager.TabPagerAdapter
import com.dichotome.profilebar.util.extensions.download
import com.dichotome.profilebarapp.R
import com.dichotome.profilebarapp.util.constant.drw
import com.dichotome.profileshared.constants.Constants
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_profile)

        val photo = drw(R.drawable.avatar)
        val wallpaper = drw(R.drawable.cover2)
        val pagerFragments = arrayListOf(
            SubscriptionsTabFragment.newInstance("Subscriptions"),
            FavouritesTabFragment.newInstance("Favourites")
        )

        profileBar.apply {
           // this.photo = photo
            subtitle = "Joined on 19 April 2017"
            title = "Pavlo Bondan"
            //this.wallpaper = wallpaper
        }

        profilePager.adapter = TabPagerAdapter(supportFragmentManager)
        profilePager.fragments = pagerFragments

        profileBar.setupWithViewPager(profilePager)
    }
}
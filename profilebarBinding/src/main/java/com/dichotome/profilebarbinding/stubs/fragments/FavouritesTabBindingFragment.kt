package com.dichotome.profilebarbinding.stubs.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.dichotome.profilebar.ui.tabPager.TabFragment
import com.dichotome.profilebar.stubs.FavRecyclerItem
import com.dichotome.profilebar.stubs.TabRecyclerItem
import com.dichotome.profilebarbinding.R
import com.dichotome.profilebarbinding.stubs.TabListAdapter
import kotlinx.android.synthetic.main.fragment_profile_tab_binding.*
import com.dichotome.profilebarbinding.databinding.ItemTabBindingFavouritesBinding

class FavouritesTabBindingFragment() : TabFragment() {
    companion object {
        fun newInstance(tabTitle: String) = FavouritesTabBindingFragment().apply {
            title = tabTitle
        }
    }
    val favList = mutableListOf<TabRecyclerItem>(
        FavRecyclerItem(
            "The Amazing Spider-Man",
            "#5, 2018",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/amazing-spider-man--2-cover-art-by-ryan-ottley.png?1384968217"
        ),
        FavRecyclerItem(
            "Star Wars",
            "#55, 2008",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/star-wars--55-cover-art-by-david-marquez.png?1384968217"
        ),
        FavRecyclerItem(
            "Esteemed comic book author",
            "#214, 2017",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/amazing-spider-man--2-cover-art-by-ryan-ottley.png?1384968217"
        ),
        FavRecyclerItem(
            "Superior comic book writer",
            "#3, 2019",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/star-wars--55-cover-art-by-david-marquez.png?1384968217"
        ),
        FavRecyclerItem(
            "Batman: Rebirth",
            "#4, 2011",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccovers2017/large/batman26-mikeljanin.png?1384968217"
        ),
        FavRecyclerItem(
            "The Amazing Spider-Man",
            "#5, 2018",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/amazing-spider-man--2-cover-art-by-ryan-ottley.png?1384968217"
        ),
        FavRecyclerItem(
            "Star Wars",
            "#55, 2008",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/star-wars--55-cover-art-by-david-marquez.png?1384968217"
        ),
        FavRecyclerItem(
            "Esteemed comic book author",
            "#214, 2017",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/amazing-spider-man--2-cover-art-by-ryan-ottley.png?1384968217"
        ),
        FavRecyclerItem(
            "Superior comic book writer",
            "#3, 2019",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccoversof2018/large/star-wars--55-cover-art-by-david-marquez.png?1384968217"
        ),
        FavRecyclerItem(
            "Batman: Rebirth",
            "#4, 2011",
            "https://cdn.pastemagazine.com/www/system/images/photo_albums/bestcomiccovers2017/large/batman26-mikeljanin.png?1384968217"
        )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        inflater.inflate(R.layout.fragment_profile_tab_binding, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = tabRecyclerViewBinding

        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter =
            TabListAdapter<ItemTabBindingFavouritesBinding>(
                favList,
                R.layout.item_tab_binding_favourites,
                false
            )
    }
}
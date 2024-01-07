package com.hakanbaysal20.getirclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.hakanbaysal20.getirclone.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    private lateinit var pageViewList:ArrayList<PageViewModel>
    private lateinit var adapter:PageViewAdapter
    private lateinit var categoryAdapter:CategoryViewAdapter
    private val adress = ArrayList<String>()
    private lateinit var adressAdapter:ArrayAdapter<String>
    private lateinit var categoryViewList:ArrayList<Category>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.pageViewRV.setHasFixedSize(true)
        binding.categoryViewRV.setHasFixedSize(true)
        binding.categoryViewRV.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
        binding.pageViewRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        pageViewList = ArrayList<PageViewModel>()
        categoryViewList = ArrayList<Category>()
        adress.add("Ev,Mehmet Akif  Ersoy mahall...")
        adress.add("Ev,Mehmet Akif  Ersoy mahall...")
        adress.add("Ev,Mehmet Akif  Ersoy mahall...")

        adressAdapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,android.R.id.text1,adress)
        binding.spinner2.adapter = adressAdapter

        val c1 = Category("Süper İkili","im_super")
        val c2 = Category("İndirimler","im_discount")
        val c3 = Category("Yeni ürünler","im_new_product")
        val c4 = Category("Su & İçecek","im_drink")
        val c5 = Category("Meyve & S..","im_fruit_vegetable")
        val c6 = Category("Fırından","im_bakery")
        val c7 = Category("Temel Gıda","im_basic_food")
        val c8 = Category("Atıştırmalık","im_snack")
        val c9 = Category("Dondurma","im_ice_cream")
        val c10 = Category("Süt Ürünleri","im_milk_products")
        val c11 = Category("Kahvaltılık","im_breakfast")
        val c12 = Category("Yiyecek","im_food")
        val c13 = Category("Fit & Form","im_fit_form")
        val c14 = Category("Kişisel Bakım","im_personal_care")
        val c15 = Category("Ev bakım","im_care")
        val c16 = Category("Ev & Yaşam","im_life")
        val c17 = Category("Teknoloji","im_technology")
        val c18 = Category("Evcil Hayvan","im_pet")
        val c19 = Category("Bebek","im_bebek")
        val c20 = Category("Cinsel Sağlık","im_sexual")

        val onboard1 = PageViewModel("im_board_free","promo")
        val onboard2 = PageViewModel("im_board_getir","promo")
        val onboard3 = PageViewModel("im_board_iphone","promo")

        adapter = PageViewAdapter(requireContext(),pageViewList)
        categoryAdapter = CategoryViewAdapter(requireContext(),categoryViewList)
        binding.categoryViewRV.adapter = categoryAdapter
        binding.pageViewRV.adapter = adapter
        categoryViewList.add(c1)
        categoryViewList.add(c2)
        categoryViewList.add(c3)
        categoryViewList.add(c4)
        categoryViewList.add(c5)
        categoryViewList.add(c6)
        categoryViewList.add(c7)
        categoryViewList.add(c8)
        categoryViewList.add(c9)
        categoryViewList.add(c10)
        categoryViewList.add(c11)
        categoryViewList.add(c12)
        categoryViewList.add(c13)
        categoryViewList.add(c14)
        categoryViewList.add(c15)
        categoryViewList.add(c16)
        categoryViewList.add(c17)
        categoryViewList.add(c18)
        categoryViewList.add(c19)
        categoryViewList.add(c20)

        pageViewList.add(onboard1)
        pageViewList.add(onboard2)
        pageViewList.add(onboard3)




        return binding.root
    }
}
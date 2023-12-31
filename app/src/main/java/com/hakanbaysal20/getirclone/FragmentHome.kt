package com.hakanbaysal20.getirclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.hakanbaysal20.getirclone.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    private lateinit var pageViewList:ArrayList<PageViewModel>
    private lateinit var adapter:PageViewAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.pageViewRV.setHasFixedSize(true)
        binding.pageViewRV.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        pageViewList = ArrayList<PageViewModel>()
        val onboard1 = PageViewModel("im_board_free","promo")
        val onboard2 = PageViewModel("im_board_getir","promo")
        val onboard3 = PageViewModel("im_board_iphone","promo")
        adapter = PageViewAdapter(requireContext(),pageViewList)
        binding.pageViewRV.adapter = adapter
        pageViewList.add(onboard1)
        pageViewList.add(onboard2)
        pageViewList.add(onboard3)
        return binding.root
    }
}
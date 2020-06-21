package com.example.covid_19

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.covid_19.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val position=arguments!!.getInt("position",0)
       binding=FragmentDetailBinding.inflate(inflater)
//        val fragment=SecondFragment()
//        val countryDetail=fragment.countryList
        (activity as MainActivity?)
            ?.setActionBarTitle("Details Of "+ SecondFragment.currentdetail!![position].getCountry())
//
        binding.global.text = SecondFragment.currentdetail!![position].getCountry()
        context?.let { Glide.with(it).load(SecondFragment.currentdetail!![position].getFlag()).into(binding.countIii) }
        binding.cases.setText(SecondFragment.currentdetail!![position].getcases())
        binding.todayCases.setText(SecondFragment.currentdetail!![position].getTodCases())
        binding.death.setText(SecondFragment.currentdetail!![position].getDeaths())
        binding.todayDeaths.setText(SecondFragment.currentdetail!![position].getTodDeath())
        binding.recovered.setText(SecondFragment.currentdetail!![position].getrecover())
        binding.critical.setText(SecondFragment.currentdetail!![position].getCritical())
        return binding.root
    }


}
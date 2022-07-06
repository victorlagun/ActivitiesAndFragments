package com.example.activitiesfragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onResume() {
        super.onResume()
        button.setOnClickListener { onClicked() }
    }

    private fun onClicked() {
        val intent = Intent(requireContext(), SecondActivity::class.java)
        requireContext().startActivity(intent)
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()
    }
}
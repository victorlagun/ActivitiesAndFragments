package com.example.activitiesfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onResume() {
        super.onResume()
        saveButton.setOnClickListener { onClicked() }

    }

    private fun onClicked() {
        setFragmentResult(
            FirstFragment.RESULT,
            bundleOf("text" to editText.text.toString())
        )
        onBackPressed()
    }

    private fun onBackPressed() {
        val fm = requireActivity().supportFragmentManager
        val ft = fm.beginTransaction()
        ft.remove(this)
        ft.commit()
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}
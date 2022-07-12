package com.example.activitiesfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onResume() {
        super.onResume()
        button.setOnClickListener { onClicked() }
        setFragmentResultListener(RESULT) { _, bundle ->
            resultText.text = bundle.getString("text")
        }
    }

    private fun onClicked() {
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, SecondFragment.newInstance())
        fragmentTransaction.commit()
    }

    companion object {
        const val RESULT = "result"

        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}
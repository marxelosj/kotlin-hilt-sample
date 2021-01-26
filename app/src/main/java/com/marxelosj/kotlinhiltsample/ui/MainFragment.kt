package com.marxelosj.kotlinhiltsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.marxelosj.kotlinhiltsample.R
import com.marxelosj.kotlinhiltsample.data.MainLocalStore
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    lateinit var mainLocalStore: MainLocalStore

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onResume() {
        super.onResume()
        val items = mainLocalStore.getLocalItems()
        view?.findViewById<TextView>(R.id.main_list)?.let {
            it.text = items.joinToString(separator = "\n")
        }
    }
}
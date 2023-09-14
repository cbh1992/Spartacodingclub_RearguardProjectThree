package com.android.rearguardprojectthree

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragment : Fragment() { private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","Create Log Test Text(Fragment)")
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("onViewCreated","ViewCreated Log Test Text(Fragment)")
    }

    override fun onStart() {
        super.onStart()

        Log.d("onStart","Start Log Test Text(Fragment)")
    }

    override fun onResume() {
        super.onResume()

        Log.d("onResume","Resume Log Test Text(Fragment)")
    }

    override fun onPause() {
        super.onPause()

        Log.d("onPause","Pause Log Test Text(Fragment)")
    }

    override fun onStop() {
        super.onStop()

        Log.d("onStop","Stop Log Test Text(Fragment)")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d("onSaveInstanceState","SaveInstanceState Log Test Text(Fragment)")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("onDestroyView","DestroyView Log Test Text(Fragment)")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("onDestroy","Destroy Log Test Text(Fragment)")
    }




    companion object {

        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
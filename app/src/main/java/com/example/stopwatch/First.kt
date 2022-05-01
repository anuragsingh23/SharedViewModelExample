package com.example.stopwatch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.stopwatch.databinding.FragmentFirstBinding

class First : Fragment() {

    private var _mBinding : FragmentFirstBinding? = null
    private val mBinding get() = _mBinding!!

    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        _mBinding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return mBinding.root
    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}
package com.satya.advweek4_160421048.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.satya.advweek4_160421048.R
import com.satya.advweek4_160421048.databinding.FragmentStudentDetailBinding
import com.satya.advweek4_160421048.viewmodel.DetailViewModel
import com.satya.advweek4_160421048.viewmodel.ListViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [StudentDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StudentDetailFragment : Fragment() {
    private lateinit var viewModel: DetailViewModel
    private lateinit var binding: FragmentStudentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_student_detail, container, false)
        binding = FragmentStudentDetailBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        viewModel.fetch()

//        binding.txtID.setText(viewModel)
        observeStudent()

        return binding.root
    }

    fun observeStudent() {
        viewModel.studentLD.observe(viewLifecycleOwner, Observer {



            binding.txtID.setText(viewModel.studentLD.value?.id)
            binding.txtName.setText(viewModel.studentLD.value?.name)
            binding.txtBoD.setText(viewModel.studentLD.value?.dob)
            binding.txtPhone.setText(viewModel.studentLD.value?.phone)
//            studentListAdapter.updateStudentList(it)
        })

//        viewModel.studentLoadErrorLD.observe(viewLifecycleOwner, Observer {
//            if(it == true) {
//                binding.txtError.visibility = View.VISIBLE
//            } else {
//                binding.txtError.visibility = View.GONE
//            }
//        })
    }


}
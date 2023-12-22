package com.example.sharedviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.sharedviewmodel.databinding.FragmentPickUpFragmnetBinding


class PickupFragment : Fragment() {
    private  val sharedViewModel: OrderViewModel by activityViewModels()
  private lateinit var binding:FragmentPickUpFragmnetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentPickUpFragmnetBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            pickupFragment = this@PickupFragment
        }

    }
     fun goToNextScreen(){
        findNavController().navigate(R.id.action_pickUpFragmnet_to_summeryFragment)
    }


}

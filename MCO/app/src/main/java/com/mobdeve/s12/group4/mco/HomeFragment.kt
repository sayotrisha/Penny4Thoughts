package com.mobdeve.s12.group4.mco

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment(R.layout.home_fragment){
    private lateinit var accountsRV: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        accountsRV = view.findViewById(R.id.accountsRV)

        val accounts = DataGenerator.generateAccountData()
        val accountsAdapter = AccountsAdapter(accounts)

        accountsRV.adapter = accountsAdapter
        accountsRV.layoutManager = LinearLayoutManager(requireContext())



    }
}
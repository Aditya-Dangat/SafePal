package com.example.safepal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listMembers = listOf<MemberModel>(
            MemberModel("Aditya"),
            MemberModel("Tanmay"),
            MemberModel("Anish"),
        )
        val adapter = MemberAdapter(listMembers)

        val recycler = requireView().findViewById<RecyclerView>(R.id.recycler_member)
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
    }

    val listContacts = listOf<ContactModel>(
        ContactModel("Aditya",123456789),
        ContactModel("Tanmay", 987654321),
        ContactModel("Anish", 976431852)
    )
    val inviteAdapter = InviteAdapter(listContacts)

    val inviteRecycler: RecyclerView = requireView().findViewById<RecyclerView>(R.id.recycler_invite)



    companion object {
        fun newInstance() = HomeFragment()
    }
}

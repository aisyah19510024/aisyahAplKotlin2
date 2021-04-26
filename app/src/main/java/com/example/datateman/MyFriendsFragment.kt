package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment(){

    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
                MyFriend("Aisyah Indah", "Perempuan", "aisyah@gmail.com", "085985697319",
                        "Malang")
        )
        listTeman.add(
                MyFriend("mulan", "Perempuan", "mulan@gmail.com", "081232356456",
                        "Balikpapan")
        )
        listTeman.add(
                MyFriend("Dewi", "Perempuan", "dewi@gmail.com", "081363625451",
                        "Sidoarjo")
        )
        listTeman.add(
                MyFriend("Dewa", "Laki-laki", "dewa@gmail.com", "085695789456",
                        "Makasar")
        )
        listTeman.add(
                MyFriend("Yudha", "Laki-laki", "Yudha@gmail.com", "082456789123",
                        "Maluku")
        )
        listTeman.add(
                MyFriend("Duwi", "Laki-laki", "duwi@gmail.com", "081478512356",
                        "jakarta")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
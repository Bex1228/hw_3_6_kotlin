package com.example.hw_3_6_kotlin

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw_3_6_kotlin.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    private lateinit var binding: FragmentFirstBinding  // Используйте ваш класс биндинга для фрагмента

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)  // Используйте метод inflate для биндинга


        val itemList = listOf("Алладин","Симба","Маккуин","Бэмби","Чудовище","Золушка","Чип","Дэйл","Лило","Стичь","Микки Маус","Винни Пух",
            "Балу","Маугли","Пумба","Белоснежка","Тарзан","Мулан","Ахилес","Шрек")

        // Получите имя, которое вы хотите передать в адаптер
        val name = ""

        // Создайте адаптер, передавая класс биндинга фрагмента
        val adapter = PersonageAdapter(requireContext(), name, itemList)

        binding.rvContainer.adapter = adapter
        binding.rvContainer.layoutManager = LinearLayoutManager(requireContext())

        return binding.root  // Верните корневой элемент биндинга в качестве view
    }
}
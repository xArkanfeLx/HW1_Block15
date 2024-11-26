package com.example.viewpager2

import java.io.Serializable

class Picture(val name:String,val author:String,val img:Int) :Serializable {
    companion object {
        val pictures = mutableListOf(
            Picture("Звездная ночь", "Винсент ван Гог",R.drawable.picture1),
            Picture("Герника", "Пабло Пикассо",R.drawable.picture2),
            Picture("Поцелуй", "Густава Климт",R.drawable.picture3),
            Picture("Ночные ястребы", "Эдвард Хоппер",R.drawable.picture4),
            Picture("Постоянство памяти", "Сальвадор Дали",R.drawable.picture5),
            Picture("Девушка с жемчужной сережкой", "Иоганн Вермеер",R.drawable.picture6),
            Picture("Американская готика", "Грант Вуд",R.drawable.picture7),
            Picture("Ночной дозор", "Рембрандт",R.drawable.picture8),
            Picture("Мона Лиза", "Леонардо да Винчи",R.drawable.picture9),
            Picture("Крик", "Эдвард Мунк",R.drawable.picture10),
        )
    }
}
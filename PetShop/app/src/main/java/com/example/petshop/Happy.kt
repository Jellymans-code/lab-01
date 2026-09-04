package com.example.petshop

class Happy(date: String) : Mood(date) {
    override fun getMoodString(): String {
        return "Happy mood on $date"
    }
}
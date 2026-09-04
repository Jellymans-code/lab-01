package com.example.petshop

class Sad(date: String) : Mood(date) {
    override fun getMoodString(): String {
        return "Sad mood on $date"
    }
}
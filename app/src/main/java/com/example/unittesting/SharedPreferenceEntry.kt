package com.example.unittesting

import java.util.*

class SharedPreferenceEntry {
    lateinit var name:String
    lateinit var email:String
    lateinit var dateOfBirth:Calendar
    constructor(name:String,dateOfBirth:Calendar,email:String)
    {
        this.email=email
        this.name=name
        this.dateOfBirth=dateOfBirth
    }

}
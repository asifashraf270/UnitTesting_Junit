package com.example.unittesting

import android.content.SharedPreferences
import java.util.*

class SharedPreferenceHelper {
    val keyName: String = "key_name"
    val keyDob: String = "key_dob"
    val keyEmail = "key_email"
    lateinit var sharedPreference: SharedPreferences

    constructor(sharedPreferences: SharedPreferences) {
        this.sharedPreference = sharedPreference
    }

    fun savePersonalInfo(sharedPreferenceEntry: SharedPreferenceEntry): Boolean {
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putString(
            keyName,
            sharedPreferenceEntry.name
        )
        editor.putLong(
            keyDob,
            sharedPreferenceEntry.dateOfBirth.timeInMillis
        )
        editor.putString(
            keyEmail,
            sharedPreferenceEntry.email
        )

        return editor.commit()
    }
    fun getPersonalInfo(): SharedPreferenceEntry? {
        val name: String = sharedPreference.getString(
            keyName,
            ""
        ).toString()
        val dobMillis: Long = sharedPreference.getLong(
            keyDob,
            Calendar.getInstance().timeInMillis
        )
        val dateOfBirth = Calendar.getInstance()
        dateOfBirth.timeInMillis = dobMillis
        val email: String = sharedPreference.getString(
           keyEmail,
            ""
        ).toString()

        // Create and fill a SharedPreferenceEntry model object.
        return SharedPreferenceEntry(name, dateOfBirth, email)
    }
}
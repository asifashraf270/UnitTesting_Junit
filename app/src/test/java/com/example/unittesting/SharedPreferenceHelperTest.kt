package com.example.unittesting

import android.content.SharedPreferences
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SharedPreferenceHelperTest {
    @Mock
    lateinit var sharedPreferences: SharedPreferences

    @Mock
    lateinit var sharedPreferenceEditor: SharedPreferences.Editor
   /* @Before
    fun initMocking()
    {
        sharedPreferences=
    }*/
}
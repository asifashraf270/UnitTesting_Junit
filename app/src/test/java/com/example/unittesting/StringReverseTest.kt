package com.example.unittesting

import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class StringReverseTest {
    lateinit var stringReverse: StringReverse

    @Before
    fun initStringReverse() {
        stringReverse = StringReverse()
    }

    @Test
    fun test_withEmptyString() {
        var result = stringReverse.reverse("")
        Truth.assertThat(result).isEqualTo("")
    }
    @Test
    fun test_withSingleString()
    {
        var result=stringReverse.reverse("a")
        Truth.assertThat(result).isEqualTo("a")
    }
    @Test
    fun test_withCompleteString()
    {
        var result=stringReverse.reverse("abc")
        Truth.assertThat(result).isEqualTo("cba")
    }

}
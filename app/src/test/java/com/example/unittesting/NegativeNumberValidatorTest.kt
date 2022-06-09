package com.example.unittesting

import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NegativeNumberValidatorTest
{
    lateinit var negativeNumberValidator:NegativeNumberValidator
    @Before
    fun setUp()
    {
        negativeNumberValidator= NegativeNumberValidator()
    }
    @Test
    fun test1()
    {
        var result=negativeNumberValidator.isNegativeNumber(-1)
        Truth.assertThat(result).isEqualTo(true)
    }
    @Test
    fun test2()
    {
        var result=negativeNumberValidator.isNegativeNumber(0)
        Truth.assertThat(result).isEqualTo(false)
    }
    @Test
    fun test3()
    {
        var result=negativeNumberValidator.isNegativeNumber(1)
        Truth.assertThat(result).isEqualTo(false)
    }
}
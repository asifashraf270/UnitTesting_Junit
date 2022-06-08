package com.example.unittesting

import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PositiveNumberValidatorTest {

    lateinit var positiveNumberValidator: PositiveNumberValidator
    @Before
    fun initPositiveNumberValidator()
    {
        positiveNumberValidator= PositiveNumberValidator()
    }
    @Test
    fun  test1()
    {
        var result=positiveNumberValidator.isPositiveNo(-1)
        Truth.assertThat(result).isEqualTo(false)

    }

    @Test
    fun test2()
    {
        var result=positiveNumberValidator.isPositiveNo(0)
        Truth.assertThat(result).isEqualTo(false)
    }
    @Test
    fun test3()
    {
        var result=positiveNumberValidator.isPositiveNo(1)
        Truth.assertThat(result).isEqualTo(true)
    }
}
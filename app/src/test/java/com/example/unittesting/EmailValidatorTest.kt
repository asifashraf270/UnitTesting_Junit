package com.example.unittesting

import com.google.common.truth.Truth
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class EmailValidatorTest {

    @Test
    fun emailValidator_correctEmailSample()
    {
        val result=EmailValidator.isValidEmail("abc@gmail.com")
        Truth.assertThat(result).isEqualTo(true)
    }
    @Test
    fun emailValidator_subdomain()
    {
        val result=EmailValidator.isValidEmail("name@email.co.uk")
        Truth.assertThat(result).isEqualTo(true)
    }
    @Test
    fun emailValidator_InvalidEmail()
    {
        val result=EmailValidator.isValidEmail("abc@gmail")
        Truth.assertThat(result).isEqualTo(false)
    }
    @Test
    fun emailValidator_InvalidEmailDoubleDot()
    {
        val result=EmailValidator.isValidEmail("abc@gmail...com")
        Truth.assertThat(result).isEqualTo(false)
    }
}
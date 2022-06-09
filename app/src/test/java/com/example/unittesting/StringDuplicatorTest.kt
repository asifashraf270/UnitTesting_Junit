package com.example.unittesting

import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class StringDuplicatorTest {
    lateinit var stringDuplicator: StringDuplicator

    @Before
    fun setUp() {
        stringDuplicator= StringDuplicator()
    }
    @Test
    fun test1()
    {
        var result=stringDuplicator.duplicate("")
        Truth.assertThat(result).isEqualTo("")
    }
    @Test
    fun test2()
    {
        var result=stringDuplicator.duplicate("a")
        Truth.assertThat(result).isEqualTo("aaa")
    }
}
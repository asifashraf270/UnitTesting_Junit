package com.example.unittesting

import com.example.unittesting.intervaloverlap.Interval
import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class IntervalAdjacencyDetectorTest {
    lateinit var intervalAdjacencyDetector: IntervalAdjacencyDetector

    @Before
    fun setUp() {
        intervalAdjacencyDetector = IntervalAdjacencyDetector()
    }
    @Test
    fun test1()
    {
        var interval1=Interval(-1,5)
        var interval2=Interval(8,12)
        var result=intervalAdjacencyDetector.isAdjacent(interval1,interval2)
        Truth.assertThat(result).isEqualTo(false)
    }
    @Test
    fun test2()
    {
        var interval1=Interval(12,15)
        var interval2=Interval(5,12)
        var result=intervalAdjacencyDetector.isAdjacent(interval1,interval2)
        Truth.assertThat(result).isEqualTo(true)
    }

}
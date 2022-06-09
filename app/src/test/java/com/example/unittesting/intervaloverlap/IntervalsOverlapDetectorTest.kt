package com.example.unittesting.intervaloverlap

import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class IntervalsOverlapDetectorTest {
    lateinit var intervalOverlapDetect: IntervalsOverlapDetector

    @Before
    fun initIntervalOverlap() {
        intervalOverlapDetect = IntervalsOverlapDetector()
    }

    @Test
    fun isOverLap_Test1() {
        var interval1 = Interval(-1, 5)
        var interval2 = Interval(8, 12)
        var result = intervalOverlapDetect.isOverLap(interval1, interval2)
        Truth.assertThat(result).isEqualTo(false)

    }

    @Test
    fun isOverlap_Test2() {
        var interval1 = Interval(-1, 5)
        var interval2 = Interval(3, 12)
        var result = intervalOverlapDetect.isOverLap(interval1, interval2)
        Truth.assertThat(result).isEqualTo(true)
    }
    @Test
    fun isOverlap_Test3()
    {
        var interval1=Interval(-1,5)
        var interval2=Interval(-4,12)
        var result=intervalOverlapDetect.isOverLap(interval1,interval2)
        Truth.assertThat(result).isEqualTo(true)
    }
    @Test
    fun isOverlap_Test4()
    {
        var interval1=Interval(-1,5)
        var interval=Interval(0,3)
        var result=intervalOverlapDetect.isOverLap(interval1,interval)
        Truth.assertThat(result).isEqualTo(true)
    }
}
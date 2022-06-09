package com.example.unittesting

import com.example.unittesting.intervaloverlap.Interval

class IntervalAdjacencyDetector {

    fun isAdjacent(interval1: Interval,interval2: Interval):Boolean{
        return interval1.end==interval2.start || interval1.start !!>= interval2.end!! ||isSame(interval1,interval2)
    }
    fun isSame(interval1:Interval,interval2:Interval):Boolean{
        return interval1.start==interval2.start && interval2.end==interval2.end
    }
}
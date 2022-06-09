package com.example.unittesting.intervaloverlap

class IntervalsOverlapDetector {

    fun isOverLap(interval1: Interval, intevale2: Interval): Boolean {
        return interval1.end!! > intevale2.start!! && interval1.start!! < intevale2.end!!
    }
}
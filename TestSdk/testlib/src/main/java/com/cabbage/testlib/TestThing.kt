package com.cabbage.testlib

import com.cabbage.innerlib.InnerThing

class TestThing1(val message: String)

class TestThing2(val inner: InnerThing)

class TestThing3(val message: String) {

    private val inner = InnerThing("")
}
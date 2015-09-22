package com.example

import com.example.data.Data
import com.example.data.DataFactory
import org.junit.Assert
import org.junit.Before
import org.junit.Test

import javax.inject.Inject

/**
 * Created by Rodrigo Quesada on 10/12/15.
 */
class MainTest {

    @Inject lateinit var dataFactory: DataFactory

    @Before
    fun setUp() {
        DaggerMainComponent.create().inject(this)
    }

    @Test
    fun testData() {
        val data = dataFactory.create(1)
        println("data: $data")
    }
}

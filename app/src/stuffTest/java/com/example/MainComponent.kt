package com.example

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Rodrigo Quesada on 10/12/15.
 */

@Singleton
@Component(modules = arrayOf(MainModule::class))
interface MainComponent {

    fun inject(test: MainTest)
}
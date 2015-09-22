package com.example.person

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Rodrigo Quesada on 10/12/15.
 */
@Singleton
class Context @Inject protected constructor() {
    val name = "Context"
}
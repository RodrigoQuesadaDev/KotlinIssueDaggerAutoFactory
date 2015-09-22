package com.example.data

/**
 * Created by Rodrigo Quesada on 10/12/15.
 */

import com.example.person.Context
import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided

@AutoFactory
data class Data protected constructor(@Provided val context: Context, val value: Int)
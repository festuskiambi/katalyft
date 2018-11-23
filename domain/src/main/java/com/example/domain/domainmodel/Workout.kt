package com.example.domain.domainmodel

/**
 * Created by Festus Kiambi on 11/23/18.
 */

data class Workout(
    var name: String,
    var exercise: List<Exercise>,
    var creationDate: String
)
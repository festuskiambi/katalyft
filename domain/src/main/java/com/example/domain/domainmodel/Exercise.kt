package com.example.domain.domainmodel

/**
 * Created by Festus Kiambi on 11/23/18.
 */

data class Exercise(
    var name: String,
    var type: String,
    var muscleGroup: List<String>,
    var sets: List<Set>,
    var unitsOfWeight: String,
    var note: String,
    var repsType: String
)
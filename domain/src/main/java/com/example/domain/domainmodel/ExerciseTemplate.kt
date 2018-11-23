package com.example.domain.domainmodel

/**
 * Created by Festus Kiambi on 11/23/18.
 */

data class ExerciseTemplate(
    val id: String,
    var name: String,
    var type: String,
    var muscleGroup: List<String>,
    var exerciseModality: String,
    var isFavourite: Boolean,
    var isCustom: Boolean
)
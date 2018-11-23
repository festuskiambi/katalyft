package com.example.domain.domainmodel

/**
 * Created by Festus Kiambi on 11/23/18.
 */
 data class WorkoutTemplate(
    val id: String,
    var name: String,
    var muscleGroups: List<String>,
    var image: String,
    var workout: Workout
)
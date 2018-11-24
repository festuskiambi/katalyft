package com.example.festus.katalyft

import com.example.domain.domainmodel.Exercise
import com.example.domain.domainmodel.ExerciseTemplate
import com.example.domain.domainmodel.Set
import com.example.domain.domainmodel.Workout

/**
 * Created by Festus Kiambi on 11/24/18.
 */

class DomainTestObjects {
    //ID comes from creation
    val TEST_WORKOUT_ID = "12345687"

    val TEST_WORKOUT_NAME = "Biceps and Calfs"

    val TEST_CREATION_DATE = "10/09/2018"

    val TEST_EXERCISE_NAME = "Bicep Curls"

    val TEST_EXERCISE_TYPE = "Isolation"

    val TEST_MUSCLE_GROUP = "Biceps"

    val TEST_UOW = "Kgs"

    val TEST_REPS_TYPE = "Reps"

    val TEST_REP_NUMBER = 10

    val TEST_WEIGHT = 35.0

    val TEST_MODALITY = "Repetitions"


    val TEST_SET: com.example.domain.domainmodel.Set = Set(
        TEST_REP_NUMBER,
        TEST_WEIGHT,
        0
    )



    val TEST_EXERCISE: Exercise = Exercise(
        TEST_EXERCISE_NAME,
        TEST_EXERCISE_TYPE,
        listOf(TEST_MUSCLE_GROUP,
            TEST_MUSCLE_GROUP),
        listOf(TEST_SET,
            TEST_SET,
            TEST_SET),
        TEST_UOW,
        "",
        TEST_REPS_TYPE
    )

    val TEST_WORKOUT: Workout = Workout(TEST_WORKOUT_NAME,
        listOf(TEST_EXERCISE,
            TEST_EXERCISE,
            TEST_EXERCISE),
        TEST_CREATION_DATE
        )


    val TEST_EXERCISE_TEMPLATE: ExerciseTemplate = ExerciseTemplate("000000",
        TEST_EXERCISE_NAME,
        TEST_EXERCISE_TYPE,
        listOf(TEST_MUSCLE_GROUP),
        TEST_MODALITY,
        true,
        false)
}
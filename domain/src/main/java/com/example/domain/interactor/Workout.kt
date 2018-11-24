package com.example.domain.interactor

import com.example.domain.domainmodel.Result
import com.example.domain.domainmodel.Workout
import com.example.domain.repository.IWorkoutRepository
import java.lang.Exception

/**
 * Created by Festus Kiambi on 11/23/18.
 */

class WorkoutInteractor(workoutRepository: IWorkoutRepository) {

    suspend fun getWorkout(creationDate: String): Result<Workout, Exception> {

    }

    suspend fun updateWorkout(workout: Workout): Result<Workout, Exception> {

    }

    suspend fun deleteWorkout(creationDate: String): Result<Boolean, Exception> {

    }

    suspend fun getWorkoutByDay(dateByDay: String): Result<Workout, Exception> {

    }

    suspend fun getWorkoutByMonth(dateByMonth: String): Result<Workout, Exception> {

    }


}

package com.example.domain.interactor

import com.example.common.coroutines.ICoroutineDispatcherProvider
import com.example.domain.domainmodel.Result
import com.example.domain.domainmodel.Workout
import com.example.domain.repository.IWorkoutRepository
import java.lang.Exception

/**
 * Created by Festus Kiambi on 11/23/18.
 */

class WorkoutInteractor(val workoutRepository: IWorkoutRepository) {

    suspend fun getWorkout(creationDate: String): Result<Exception, Workout> {
        return workoutRepository.getWorkoutById(creationDate)
    }

    suspend fun updateWorkout(workout: Workout): Result< Exception,Workout> {
        return workoutRepository.updateWorkout(workout)

    }

    suspend fun deleteWorkout(creationDate: String): Result<Exception,Boolean> {
        return workoutRepository.deleteWorkout(creationDate)

    }

    suspend fun getWorkoutByDay(dateByDay: String): Result<Exception,Workout> {
        return workoutRepository.getWorkoutByDay(dateByDay)

    }

    suspend fun getWorkoutByMonth(dateByMonth: String): Result<Exception,Workout > {
        return workoutRepository.getWorkoutByMonth(dateByMonth)

    }


}

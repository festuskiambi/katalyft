package com.example.domain.repository

import com.example.domain.domainmodel.Result
import com.example.domain.domainmodel.Workout

/**
 * Created by Festus Kiambi on 11/23/18.
 */

interface IWorkoutRepository {
    fun getWorkoutById(id: String): Result<Exception, Workout>
    fun updateWorkout(workout: Workout):  Result<Exception, Workout>
    fun deleteWorkout(id: String): Result<java.lang.Exception,Boolean>
    fun getWorkoutByDay(dateByDay: String): Result<Exception,Workout>
    fun getWorkoutByMonth(dateByMonth: String): Result<Exception,Workout>
}
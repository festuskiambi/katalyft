package com.example.domain.interactor

import com.example.domain.domainmodel.WorkoutTemplate
import com.example.domain.domainmodel.Result
import com.example.domain.repository.IWorkoutTemplateRepository
import java.lang.Exception

/**
 * Created by Festus Kiambi on 11/23/18.
 */


class WorkoutTemplateInteractor(WorkoutTemplateRepository: IWorkoutTemplateRepository) {

    suspend fun getWorkoutTemplate(name: String): Result<WorkoutTemplate, Exception> {
        return TODO()

    }

    suspend fun updateWorkoutTemplate(template: WorkoutTemplate): Result<WorkoutTemplate, Exception> {
        return TODO()

    }

    suspend fun deleteWorkoutTemplate(id: String): Result<Boolean, Exception> {
        return TODO()

    }

    suspend fun getWorkoutTemplateByFilters(filters: List<String>): Result<WorkoutTemplate, Exception> {
        return TODO()

    }

}
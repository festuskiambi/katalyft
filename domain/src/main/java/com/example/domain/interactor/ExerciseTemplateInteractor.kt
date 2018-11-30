package com.example.domain.interactor

import com.example.domain.domainmodel.Result
import com.example.domain.domainmodel.ExerciseTemplate
import com.example.domain.repository.IExerciseTemplateRepository
import java.lang.Exception

/**
 * Created by Festus Kiambi on 11/23/18.
 */

class ExerciseTemplateInteractor(ExerciseTemplateRepository: IExerciseTemplateRepository) {

    suspend fun getExerciseTemplate(name: String): Result<ExerciseTemplate, Exception> {
        return TODO()

    }

    suspend fun updateExerciseTemplate(template: ExerciseTemplate): Result<ExerciseTemplate, Exception> {
        return TODO()

    }

    suspend fun deleteExerciseTemplate(id: String): Result<Boolean, Exception> {
        return TODO()

    }

    suspend fun getExerciseTemplateByFilters(filters: List<String>): Result<ExerciseTemplate, Exception> {
        return TODO()

    }

}
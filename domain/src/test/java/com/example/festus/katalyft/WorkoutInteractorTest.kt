package com.example.festus.katalyft

import com.example.common.coroutines.ICoroutineDispatcherProvider
import com.example.domain.interactor.WorkoutInteractor
import com.example.domain.repository.IWorkoutRepository
import org.junit.Before
import org.mockito.Mock
import org.mockito.MockitoAnnotations

/**
 * Created by Festus Kiambi on 11/29/18.
 */

class WorkoutInteractorTest {

    lateinit var interactor: WorkoutInteractor

    val test = DomainTestObjects()

    @Mock
    lateinit var repository: IWorkoutRepository

    @Mock
    lateinit var context: ICoroutineDispatcherProvider

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        interactor = WorkoutInteractor(repository, context)

    }


}
package com.example.festus.katalyft

import com.example.common.coroutines.ICoroutineDispatcherProvider
import com.example.domain.domainmodel.Result
import com.example.domain.interactor.WorkoutInteractor
import com.example.domain.repository.IWorkoutRepository
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Created by Festus Kiambi on 11/29/18.
 */

class WorkoutInteractorTest {

    lateinit var interactor: WorkoutInteractor

    val test = DomainTestObjects()

    @Mock
    lateinit var repository: IWorkoutRepository


    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        interactor = WorkoutInteractor(repository)

    }

    @Test
    fun `Get Workout By Id Successful`() = runBlocking<Unit> {
        Mockito.`when`(repository.getWorkoutById(test.TEST_WORKOUT_ID))
            .thenReturn(Result.build { test.TEST_WORKOUT })

        interactor.getWorkout(test.TEST_CREATION_DATE)

        Mockito.verify(repository).getWorkoutById(test.TEST_CREATION_DATE)
    }

    @Test
    fun `Update Workout successful` () = runBlocking<Unit> {
        Mockito.`when`(repository.updateWorkout(test.TEST_WORKOUT))
            .thenReturn(Result.build { test.TEST_WORKOUT })


        interactor.updateWorkout(test.TEST_WORKOUT)
        Mockito.verify(repository).updateWorkout(test.TEST_WORKOUT)

    }

    @Test
    fun `Delete Workout successful` () = runBlocking<Unit> {
        Mockito.`when`(repository.deleteWorkout(test.TEST_CREATION_DATE))
            .thenReturn(Result.build { true })

        interactor.deleteWorkout(test.TEST_CREATION_DATE)
        Mockito.verify(repository).deleteWorkout(test.TEST_CREATION_DATE)
    }

    @Test
    fun `Get workout By Day Succesful` () = runBlocking <Unit>{
        Mockito.`when`(repository.getWorkoutByDay(test.TEST_CREATION_DATE))
            .thenReturn(Result.build { test.TEST_WORKOUT })

        interactor.getWorkoutByDay(test.TEST_CREATION_DATE)
        Mockito.verify(repository).getWorkoutByDay(test.TEST_CREATION_DATE)
    }

    @Test
    fun `Get Workout By Month Succesful` () = runBlocking<Unit> {
        Mockito.`when`(repository.getWorkoutByMonth(test.TEST_CREATION_DATE))
            .thenReturn(Result.build { test.TEST_WORKOUT })

        interactor.getWorkoutByMonth(test.TEST_CREATION_DATE)
        Mockito.verify(repository).getWorkoutByMonth(test.TEST_CREATION_DATE)
    }

}
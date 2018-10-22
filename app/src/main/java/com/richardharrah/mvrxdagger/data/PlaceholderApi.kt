package com.richardharrah.mvrxdagger.data

import com.richardharrah.mvrxdagger.data.models.Todo
import com.richardharrah.mvrxdagger.data.models.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface PlaceholderApi {

    @GET("/todos")
    fun todos(): Observable<List<Todo>>

    @GET("/users")
    fun users(): Observable<List<User>>

    @GET("/todos/{todoId}")
    fun todo(@Path("todoId") id: Int): Observable<Todo>

    @GET("/users/{userId}")
    fun user(@Path("userId") id: Int): Observable<User>

}
package io.github.jitinsharma.reduxmovieexample.reducers

import io.github.jitinsharma.reduxmovieexample.actions.DisplayMovies
import io.github.jitinsharma.reduxmovieexample.states.MovieListState
import tw.geothings.rekotlin.Action

/**
 * Created by jsharma on 15/01/18.
 */

fun movieListReducer(action: Action, movieListState: MovieListState?): MovieListState {
    var state = movieListState ?: MovieListState()
    when (action) {
        is DisplayMovies -> {
            state = state.copy(movieObjects = action.movieObjects)
        }
    }
    return state
}
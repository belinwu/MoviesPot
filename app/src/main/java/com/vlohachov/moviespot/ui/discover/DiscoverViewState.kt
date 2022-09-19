package com.vlohachov.moviespot.ui.discover

import com.vlohachov.domain.model.genre.Genre
import com.vlohachov.moviespot.core.ViewState

data class DiscoverViewState(
    val year: String = "",
    val genresViewState: ViewState<List<Genre>> = ViewState.Loading,
    val selectedGenres: List<Genre> = listOf(),
    val error: Throwable? = null,
)

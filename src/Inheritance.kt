
sealed class UiState {
    object Loading : UiState()
    data class Success(val data: String) : UiState()
    data class Error(val message: String) : UiState()
}

fun handleState(state: UiState) = when (state) {
    is UiState.Loading -> println("Loading...")
    is UiState.Success -> println("Got: ${state.data}")
    is UiState.Error -> println("Error: ${state.message}")
}
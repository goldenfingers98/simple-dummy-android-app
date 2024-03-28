package tn.ksoftwares.example.utils

// this class should be in an independent library to be shared among all domain libraries
sealed class ResourceState<T> {
    class Loading<T> : ResourceState<T>()
    data class Success<T>(val data: T) : ResourceState<T>()
    data class Error<T>(val error: ResourceStateError) : ResourceState<T>()
}
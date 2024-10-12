package com.github.app.di

import com.github.app.data.repository.DatabaseSearchHistoryRepository
import com.github.app.data.repository.GitHubUserRepository
import com.github.app.domain.repository.HomeRepository
import com.github.app.domain.repository.SearchHistoryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindHomeRepository(
        repository: GitHubUserRepository,
    ): HomeRepository

    @Binds
    abstract fun bindSearchHistoryRepository(
        repository: DatabaseSearchHistoryRepository,
    ): SearchHistoryRepository
}
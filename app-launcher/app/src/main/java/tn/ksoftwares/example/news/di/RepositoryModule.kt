package tn.ksoftwares.example.news.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import tn.ksoftwares.example.news.datasource.remote.RemoteNewsDataSource
import tn.ksoftwares.example.ports.spi.NewsRepository
import tn.ksoftwares.example.news.repository.NewsRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideNewsRepository(
        remoteNewsDataSource: RemoteNewsDataSource
    ): NewsRepository = NewsRepositoryImpl(remoteNewsDataSource)

}
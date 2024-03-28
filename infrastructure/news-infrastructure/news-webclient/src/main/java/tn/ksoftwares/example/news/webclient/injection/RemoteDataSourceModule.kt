package tn.ksoftwares.example.news.webclient.injection

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import tn.ksoftwares.example.news.datasource.remote.RemoteNewsDataSource
import tn.ksoftwares.example.news.webclient.RemoteNewsWebClient

@Module
@InstallIn(SingletonComponent::class)
interface RemoteDataSourceModule {

    @Binds
    fun bindNewsRemoteDataSource(remoteNewsWebClient: RemoteNewsWebClient): RemoteNewsDataSource

}
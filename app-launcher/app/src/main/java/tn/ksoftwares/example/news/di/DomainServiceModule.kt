package tn.ksoftwares.example.news.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import tn.ksoftwares.example.ports.api.NewsService
import tn.ksoftwares.example.ports.spi.NewsRepository
import tn.ksoftwares.example.service.NewsServiceImpl

@Module
@InstallIn(SingletonComponent::class)
class DomainServiceModule {

    @Provides
    fun provideNewsDomainService(newsRepository: NewsRepository): NewsService {
        return NewsServiceImpl(newsRepository)
    }

}
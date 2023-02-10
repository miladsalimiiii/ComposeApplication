package com.example.composeapplication.feature.splash.domain.repository

import kotlinx.coroutines.flow.Flow

interface SplashScreenRepository {
    suspend fun checkAppLastVersion() : Flow<Boolean>
}
package com.example.metrobugreproduction

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ForScope
import dev.zacsweers.metro.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

interface AppGraph {

  @Provides
  @ForAppScope // <-- what? It thinks this is a different qualifier
  fun provideApplicationCoroutineScope(): CoroutineScope =
    CoroutineScope(SupervisorJob() + Dispatchers.Default)

  @Provides
  @ForScope(AppScope::class)
  fun provideApplicationName(): String = "Test Application"
}
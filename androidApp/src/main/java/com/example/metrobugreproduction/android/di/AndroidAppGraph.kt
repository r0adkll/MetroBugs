package com.example.metrobugreproduction.android.di

import com.example.metrobugreproduction.AppGraph
import com.example.metrobugreproduction.ForAppScope
import com.example.metrobugreproduction.android.di.ApplicationInitializer
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Provides
import dev.zacsweers.metro.SingleIn
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

@SingleIn(AppGraph::class)
@DependencyGraph(AppScope::class)
interface AndroidAppGraph : AppGraph {

  val appInitializer: ApplicationInitializer

  // FIXME: Uncomment this, and comment out the provides in AppGraph to see it work
//  @Provides
//  @ForAppScope
//  fun provideApplicationCoroutineScope(): CoroutineScope =
//    CoroutineScope(SupervisorJob() + Dispatchers.Default)
}
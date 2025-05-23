package com.example.metrobugreproduction

import com.example.feature.FeatureApi
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.SingleIn

@SingleIn(AppGraph::class)
@DependencyGraph(AppScope::class)
interface IosAppGraph : AppGraph {

  val featureApi: FeatureApi
}
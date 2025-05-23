package com.example.feature

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesBinding
import dev.zacsweers.metro.Inject

@ContributesBinding(AppScope::class)
@Inject
class FeatureImpl : FeatureApi {

  override fun doFeatureStuff() {
    println("I did something!")
  }
}
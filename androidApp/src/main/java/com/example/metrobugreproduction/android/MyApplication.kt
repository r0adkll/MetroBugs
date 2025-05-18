package com.example.metrobugreproduction.android

import android.app.Application
import com.example.metrobugreproduction.android.di.AndroidAppGraph
import dev.zacsweers.metro.createGraph

class MyApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    val graph = createGraph<AndroidAppGraph>()
    println("The Graph! $graph")

    graph.appInitializer.doTheThing()
  }
}
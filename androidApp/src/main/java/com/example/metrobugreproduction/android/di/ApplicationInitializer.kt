package com.example.metrobugreproduction.android.di

import com.example.metrobugreproduction.ForAppScope
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ForScope
import dev.zacsweers.metro.Inject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Inject
class ApplicationInitializer(
  @ForAppScope val scope: CoroutineScope,
  @ForScope(AppScope::class) val appName: String,
) {

  fun doTheThing() {
    scope.launch {
      println("App Name: $appName")
    }
  }
}
package com.bmk.daggerproject.ui.main

import androidx.appcompat.app.AppCompatActivity
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
public abstract class ActivityModule() {
    @Binds
    abstract fun provideAppCompatActivity(activity: MainActivity): AppCompatActivity

    @Binds
    abstract fun provideMainActivity(activity: MainActivity): MainContract
}
package com.parakeetstudios.spellmount.managers

import org.koin.core.component.KoinComponent

interface Manager : KoinComponent {

    fun onEnable()

    fun onDisable()

}
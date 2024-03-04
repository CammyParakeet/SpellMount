package com.parakeetstudios.spellmount.inject

import com.parakeetstudios.spellmount.MountPlugin
import org.koin.dsl.module

class KoinModule {

    fun initPlugin(plugin: MountPlugin) = module {
        single { plugin }
        single { plugin.logger }
    }

    // Module for managing classes
    val managerModule = module {

    }


}
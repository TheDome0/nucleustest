package org.example.nucleustest

import dev.nucleusframework.application.DecoratedWindow
import dev.nucleusframework.application.NucleusBackend
import dev.nucleusframework.application.nucleusApplication

fun main() = nucleusApplication(backend = NucleusBackend.Awt) {
    DecoratedWindow(
        onCloseRequest = ::exitApplication,
        title = "nucleustest",
    ) {
        App()
    }
}
import dev.nucleusframework.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.nucleus)
}

dependencies {
    implementation(projects.shared)

    implementation(compose.desktop.currentOs)
    implementation(libs.kotlinx.coroutinesSwing)

    implementation(libs.compose.uiToolingPreview)
    implementation(libs.nucleus.core)
    implementation(libs.nucleus.application)
    implementation(libs.nucleus.darkmode)
    implementation(libs.nucleus.systemColor)
    implementation(libs.nucleus.aot)
    implementation(libs.nucleus.decoratedWindow.tao)
    implementation(libs.nucleus.decoratedWindow.awt)
    implementation(libs.nucleus.menuMacos)
    implementation(libs.nucleus.sfSymbols)
}

nucleus.application {
    mainClass = "org.example.nucleustest.MainKt"

    nativeDistributions {
        targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
        packageName = "org.example.nucleustest"
        packageVersion = "1.0.0"
    }
}
package BuildFeatures_FileContentReplacerKotlin

import BuildFeatures_FileContentReplacerKotlin.buildTypes.*
import BuildFeatures_FileContentReplacerKotlin.vcsRoots.*
import BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "f36bf8c7-e2de-42ab-9c67-60a00c676054"
    extId = "BuildFeatures_FileContentReplacerKotlin"
    parentId = "BuildFeatures"
    name = "File Content Replacer Kotlin"

    vcsRoot(BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

    buildType(BuildFeatures_FileContentReplacerKotlin_Custom)
    buildType(BuildFeatures_FileContentReplacerKotlin_NewBuild)
    buildType(BuildFeatures_FileContentReplacerKotlin_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = BuildFeatures_FileContentReplacerKotlin_FileContentReplacer.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})

package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks_Sp : Template({
    uuid = "44eeb44a-e898-4418-95bd-9835fa103319"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks_Sp"
    name = "Spaces in names"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            id = "RUNNER_29"
            scriptContent = "exit 0"
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_144"
            fileRules = """
                "**/filename with spaces.*"
                "**/foldername with spaces/*.*"
            """.trimIndent()
            pattern = "aaa"
            replacement = "REPLACED"
        }
    }
})

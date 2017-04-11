package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMasks.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMasks : Template({
    uuid = "4816687d-cab6-440a-a1a8-643a304b41f7"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMasks"
    name = "Backslash in file path"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            id = "RUNNER_28"
            scriptContent = "exit 0"
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_113"
            fileRules = """**\*.*"""
            pattern = "aaa"
            replacement = "REPLACED"
        }
    }
})

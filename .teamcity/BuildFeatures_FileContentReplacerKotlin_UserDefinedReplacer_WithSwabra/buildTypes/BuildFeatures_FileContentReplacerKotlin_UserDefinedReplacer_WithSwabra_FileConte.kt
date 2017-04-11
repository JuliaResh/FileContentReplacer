package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_FileConte : Template({
    uuid = "3ecec3c4-eec1-4bc0-ba20-413da57a2b86"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_FileConte"
    name = "File Content Replacer with swabra"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            id = "RUNNER_554"
            scriptContent = "exit 0"
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_150"
            fileRules = "**/*.*"
            pattern = "^cc"
            replacement = "ddd"
        }
        swabra {
            id = "swabra"
            filesCleanup = Swabra.FilesCleanup.AFTER_BUILD
            verbose = true
        }
    }

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Windows", "RQ_104")
    }
})

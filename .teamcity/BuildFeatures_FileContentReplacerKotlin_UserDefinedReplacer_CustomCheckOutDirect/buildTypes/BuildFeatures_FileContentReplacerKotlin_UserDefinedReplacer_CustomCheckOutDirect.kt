package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect : Template({
    uuid = "49e2865f-a1cc-4001-9080-e8719fb71cee"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect"
    name = "Custom checkout directory"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
        checkoutDir = "Моя Директория"
    }

    steps {
        script {
            id = "RUNNER_489"
            scriptContent = "exit 0"
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_149"
            fileRules = "**/UTF*.txt"
            pattern = "ccc"
            replacement = "ddd"
        }
    }

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Windows", "RQ_4")
    }
})

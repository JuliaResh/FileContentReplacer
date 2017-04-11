package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI.buildTypes

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

object Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI : Template({
    uuid = "f809f98f-450b-4ad6-961f-3ea80ee99648"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI"
    name = "Lock file in build"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            id = "RUNNER_565"
            scriptContent = """
                start notepad UTF_with_BOM.txt
                exit 0
            """.trimIndent()
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_152"
            fileRules = "*.txt"
            pattern = "aaa"
            replacement = "ccc"
        }
        swabra {
            id = "swabra"
            lockingProcesses = Swabra.LockingProcessPolicy.KILL
            verbose = true
        }
    }

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Windows", "RQ_80")
    }
})

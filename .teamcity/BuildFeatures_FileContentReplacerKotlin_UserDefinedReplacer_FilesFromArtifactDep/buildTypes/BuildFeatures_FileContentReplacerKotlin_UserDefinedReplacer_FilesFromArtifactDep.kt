package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep : Template({
    uuid = "999ccf65-ff7e-4db6-ad45-d0dd6e65f0ef"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep"
    name = "Search in files retrieved via artifact dependency"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            id = "RUNNER_556"
            scriptContent = "exit 0"
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_151"
            fileRules = "**/*.*"
            pattern = "ccc"
            replacement = "ddd"
        }
    }

    dependencies {
        artifacts(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactD_2) {
            id = "ARTIFACT_DEPENDENCY_19"
            buildRule = lastSuccessful()
            artifactRules = "artifacts.zip!* =>"
        }
    }

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Windows", "RQ_69")
    }
})

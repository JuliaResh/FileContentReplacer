package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe : Template({
    uuid = "0f2b1ef2-2a3c-4f0d-a707-50b0dd28b2cb"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe"
    name = "Several replacements in the same file"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            id = "RUNNER_476"
            scriptContent = "exit 0"
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_147"
            fileRules = "UTF_with_BOM.txt"
            pattern = "a"
            replacement = "aa"
        }
        replaceContent {
            id = "BUILD_EXT_148"
            fileRules = "UTF_with_BOM.txt"
            pattern = "aa"
            replacement = "dad"
        }
    }

    requirements {
        contains("teamcity.agent.jvm.os.name", "Windows", "RQ_97")
    }
})

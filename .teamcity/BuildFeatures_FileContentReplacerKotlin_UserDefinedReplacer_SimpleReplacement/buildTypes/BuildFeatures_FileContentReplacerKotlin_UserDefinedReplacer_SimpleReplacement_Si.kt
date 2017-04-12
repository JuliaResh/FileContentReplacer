package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Si : Template({
    uuid = "10cdd16a-3bb9-443f-90ce-7fa22bca536f"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Si"
    name = "Simple replacement"

    artifactRules = "**/* =>"

    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            id = "RUNNER_611"
            scriptContent = """
                echo "inside build step"
                cat file.txt
                exit 0
            """.trimIndent()
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_153"
            fileRules = "**/file.txt"
            pattern = "first"
            caseSensitivePattern = false
            replacement = "replaced first"
        }
        replaceContent {
            id = "BUILD_EXT_155"
            fileRules = "file.txt"
            pattern = """(\s)\d{5,6}"""
            replacement = """${'$'}1\654321"""
        }
    }

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Windows", "RQ_1")
    }
})

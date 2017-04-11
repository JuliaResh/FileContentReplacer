package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpecialSymbolsInRepl : BuildType({
    uuid = "a5a76e2c-8de8-439f-ad0b-c8adf4028676"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpecialSymbolsInRepl"
    name = "Special symbols in replace string (dollar)"
    description = "TW-43016"

    params {
        param("param", "${'$'}lalala")
    }

    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

    }

    steps {
        script {
            scriptContent = "type file.txt"
        }
    }

    features {
        replaceContent {
            fileRules = "+:**"
            pattern = ".*"
            replacement = "%param%"
        }
    }
})

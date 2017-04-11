package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpecialSymolsInRepla : BuildType({
    uuid = "9a535388-fea1-44df-b837-afb09018c1c0"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpecialSymolsInRepla"
    name = "Special symbols in replace string (backslash)"
    description = "TW-43016"

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
            replacement = "%system.teamcity.build.checkoutDir%"
        }
    }
})

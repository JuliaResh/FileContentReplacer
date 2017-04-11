package BuildFeatures_FileContentReplacerKotlin.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildFeatures_FileContentReplacerKotlin_NewBuild : BuildType({
    uuid = "b499eda9-78bc-4330-8fb1-20905d065d3c"
    extId = "BuildFeatures_FileContentReplacerKotlin_NewBuild"
    name = "New Build"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        script {
            scriptContent = """
                echo Hi!
                exit 0
            """.trimIndent()
        }
    }

    features {
        replaceContent {
            fileRules = "**/*.*"
            pattern = "aa"
            replacement = "ss"
        }
        replaceContent {
            fileRules = "**/AssemblyInfo.cpp"
            pattern = """(^\s*\[\s*assembly\s*:\s*((System\s*::)?\s*Reflection\s*::)?\s*AssemblyFileVersion(Attribute)?\s*\(\s*\")(([0-9\*])+.?)+(\"\s*\)\s*\])"""
            replacement = """${'$'}1\%build.number%${'$'}7"""
        }
        replaceContent {
            fileRules = "**/Properties/AssemblyInfo.cs"
            pattern = """(^\s*\[\s*assembly\s*:\s*((System\s*\.)?\s*Reflection\s*\.)?\s*AssemblyInformationalVersion(Attribute)?\s*\(\s*@?\")([^\"]*)(\"\s*\)\s*\])"""
            replacement = """${'$'}1\%build.number%${'$'}6"""
            encoding = FileContentReplacer.FileEncoding.UTF_16LE
            customEncodingName = "UTF-16LE"
        }
    }
})

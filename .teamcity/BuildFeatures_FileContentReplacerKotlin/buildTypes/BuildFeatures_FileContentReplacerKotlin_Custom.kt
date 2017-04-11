package BuildFeatures_FileContentReplacerKotlin.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.AntBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.AntBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ant

object BuildFeatures_FileContentReplacerKotlin_Custom : BuildType({
    uuid = "77c8502a-b7d1-4d9f-bd3d-70a0a9191c2f"
    extId = "BuildFeatures_FileContentReplacerKotlin_Custom"
    name = "Custom"

    artifactRules = """**\* =>"""
    buildNumberPattern = "1.0.0.%build.counter%"

    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)
        root("Dependencies_Calculator_SvnHttpsLocalhost7443svnCalculatorTrunk")

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        ant {
            mode = antScript {
                content = """
                    <project name="Copy files" basedir=".">
                      <target name="default">
                       <copy todir="./replaced">
                        <fileset dir="."/>
                       </copy>
                      </target>
                    </project>
                """.trimIndent()
            }
        }
    }

    features {
        replaceContent {
            enabled = false
            fileRules = "**/*.txt"
            pattern = "йцукен"
            replacement = "REPLACED"
            encoding = FileContentReplacer.FileEncoding.CUSTOM
            customEncodingName = "windows-1251"
        }
        replaceContent {
            enabled = false
            fileRules = "**/Properties/AssemblyInfo.cs"
            pattern = """(^\s*\[\s*assembly\s*:\s*((System\s*\.)?\s*Reflection\s*\.)?\s*AssemblyVersion(Attribute)?\s*\(\s*@?\")(([0-9\*])+.?)+(\"\s*\)\s*\])"""
            replacement = """${'$'}1\%build.number%${'$'}7"""
        }
        replaceContent {
            fileRules = "**/*.*"
            pattern = "^path"
            replacement = "mypath"
        }
    }
})

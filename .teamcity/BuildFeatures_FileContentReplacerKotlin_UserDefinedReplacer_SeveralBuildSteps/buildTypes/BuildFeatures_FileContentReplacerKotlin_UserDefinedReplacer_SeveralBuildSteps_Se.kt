package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.AntBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.AntBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Se : Template({
    uuid = "f1fba9a3-04c5-43c9-b728-9c4024577f34"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Se"
    name = "Several build steps"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        ant {
            id = "RUNNER_67"
            mode = antScript {
                content = """
                    <project name="Sleep">
                    <target name="default">
                    <sleep seconds="10"/>
                    </target>
                    </project>
                """.trimIndent()
            }
        }
        script {
            id = "RUNNER_468"
            scriptContent = "exit 0"
        }
    }

    features {
        replaceContent {
            id = "BUILD_EXT_145"
            fileRules = "UTF_with_BOM.txt"
            pattern = "ccc"
            replacement = "cccaccc"
        }
    }

    requirements {
        contains("teamcity.agent.jvm.os.name", "%agent.os%", "RQ_13")
    }
})

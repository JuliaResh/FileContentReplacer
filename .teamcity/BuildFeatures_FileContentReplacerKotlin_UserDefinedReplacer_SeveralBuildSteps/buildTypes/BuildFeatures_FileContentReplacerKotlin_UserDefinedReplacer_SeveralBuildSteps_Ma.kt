package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Ma : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Se)
    uuid = "6e222529-71c4-4193-8731-b13e9c74509a"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Ma"
    name = "Mac OS"

    requirements {
        contains("teamcity.agent.jvm.os.name", "Mac", "RQ_114")
    }
    
    disableSettings("RQ_13")
})

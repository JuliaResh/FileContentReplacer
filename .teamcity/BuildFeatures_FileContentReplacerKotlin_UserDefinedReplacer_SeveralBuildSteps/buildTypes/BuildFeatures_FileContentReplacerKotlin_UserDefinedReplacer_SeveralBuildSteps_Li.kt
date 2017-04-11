package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Li : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Se)
    uuid = "0760639b-1e08-492c-b35e-d2218cd47e18"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Li"
    name = "Linux"

    params {
        param("agent.os", "Linux")
    }

    requirements {
        contains("teamcity.agent.jvm.os.name", "Linux", "RQ_130")
    }
    
    disableSettings("RQ_13")
})

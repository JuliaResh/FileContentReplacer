package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Wi : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Se)
    uuid = "126d3ec2-149d-4817-8518-eabf9eeab0fa"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Wi"
    name = "Windows"

    requirements {
        contains("teamcity.agent.jvm.os.name", "Windows", "RQ_11")
    }
    
    disableSettings("RQ_13")
})

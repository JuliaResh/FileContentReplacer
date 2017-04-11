package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Li : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Si)
    uuid = "1fbbf89e-f546-43ed-8a9f-83e207a8f9ee"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Li"
    name = "Linux"

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Linux", "RQ_179")
    }
    
    disableSettings("RQ_1")
})

package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Ma : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Si)
    uuid = "dc22d606-c618-41f1-952d-cd66365d9406"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Ma"
    name = "Mac OS"

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Mac", "RQ_39")
    }
    
    disableSettings("RQ_1")
})

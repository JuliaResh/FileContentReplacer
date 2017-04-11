package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_4 : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes.Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect)
    uuid = "bbb2cae4-533b-4144-8460-aea2a9f164cc"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_4"
    name = "Mac OS"

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Mac", "RQ_10")
    }
    
    disableSettings("RQ_4")
})

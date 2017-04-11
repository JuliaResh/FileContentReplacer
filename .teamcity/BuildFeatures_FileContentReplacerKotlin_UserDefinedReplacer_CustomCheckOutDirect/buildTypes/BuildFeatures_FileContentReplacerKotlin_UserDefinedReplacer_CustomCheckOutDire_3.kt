package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_3 : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes.Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect)
    uuid = "2b02a720-357d-4d85-8812-197ac8f67849"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_3"
    name = "Linux"

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Linux", "RQ_102")
    }
    
    disableSettings("RQ_4")
})

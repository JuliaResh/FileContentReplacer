package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "296cfb73-a54f-4dbc-91f7-c98dd1786e18"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "Custom CheckOut Directory"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_2)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_3)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_4)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_5)

    template(Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect)
})

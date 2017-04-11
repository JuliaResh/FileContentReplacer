package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b12810cc-a5ce-4c47-9acb-e8278a362f3b"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "Simple Replacement"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Wi)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Ma)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Li)

    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Si)
})

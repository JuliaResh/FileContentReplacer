package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "3a885997-1478-4dcf-9b60-7b33b54c6d42"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    parentId = "BuildFeatures_FileContentReplacerKotlin"
    name = "User-Defined Replacer"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpecialSymolsInRepla)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpecialSymbolsInRepl)
})

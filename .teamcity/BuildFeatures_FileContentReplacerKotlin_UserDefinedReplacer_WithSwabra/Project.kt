package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "05e01238-8156-4d28-84b2-f0e92ceda3e0"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "With Swabra"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_Windows)

    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_FileConte)
})

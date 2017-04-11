package BuildFeatures_FileContentReplacerKotlin_InfoPlistTemplates

import BuildFeatures_FileContentReplacerKotlin_InfoPlistTemplates.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "831fc735-e52a-4966-b6bc-b1b572bf5c03"
    extId = "BuildFeatures_FileContentReplacerKotlin_InfoPlistTemplates"
    parentId = "BuildFeatures_FileContentReplacerKotlin"
    name = "Info.plist templates"

    buildType(BuildFeatures_FileContentReplacerKotlin_InfoPlistTemplates_PatchInfoPlist)
})

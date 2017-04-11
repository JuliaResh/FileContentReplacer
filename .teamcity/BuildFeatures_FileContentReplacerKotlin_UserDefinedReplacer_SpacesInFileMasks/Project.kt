package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b305175c-7abe-4b8a-8192-58b27e04704f"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "Spaces in File Masks"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks__2)

    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SpacesInFileMasks_Sp)
})

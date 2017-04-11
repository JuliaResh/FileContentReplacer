package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMasks

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMasks.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "9c243375-5eb7-4268-93be-7d11a5d57705"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMasks"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "Backslash in file masks"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMas_2)

    template(Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_BackslashInFileMasks)
})

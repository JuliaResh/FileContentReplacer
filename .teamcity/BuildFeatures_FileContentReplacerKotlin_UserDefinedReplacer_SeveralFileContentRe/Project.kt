package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "3114b74f-c0e2-424f-9402-5954a57c22b8"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "Several File Content Replacers"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_5)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_4)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_3)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_2)

    template(Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe)
})

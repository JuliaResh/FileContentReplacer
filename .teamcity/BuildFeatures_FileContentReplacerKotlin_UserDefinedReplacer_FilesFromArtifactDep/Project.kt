package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "7c6b6575-6cc7-4f55-9266-4f58184e33e7"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "Files From Artifact Dependency"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactD_2)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactD_3)

    template(Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep)
})

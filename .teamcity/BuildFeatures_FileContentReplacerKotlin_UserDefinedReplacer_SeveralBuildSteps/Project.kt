package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps

import BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "4005ec09-5872-4a69-8ea5-c1c4754aa437"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps"
    parentId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer"
    name = "Several Build Steps"

    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Ma)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Li)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Wi)
    buildType(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Ru)

    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Se)
})

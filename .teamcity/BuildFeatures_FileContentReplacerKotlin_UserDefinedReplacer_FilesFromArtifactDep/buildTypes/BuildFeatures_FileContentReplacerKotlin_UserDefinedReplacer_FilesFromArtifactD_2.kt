package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactDep.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactD_2 : BuildType({
    uuid = "c4d99d6c-8a65-4d83-aa08-33057c1f0c1b"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_FilesFromArtifactD_2"
    name = "Build with artifacts"

    artifactRules = "**/* => artifacts.zip"

    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }
})

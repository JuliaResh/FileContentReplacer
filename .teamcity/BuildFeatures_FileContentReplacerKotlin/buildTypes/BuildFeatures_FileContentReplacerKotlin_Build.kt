package BuildFeatures_FileContentReplacerKotlin.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent

object BuildFeatures_FileContentReplacerKotlin_Build : BuildType({
    uuid = "5f7678e0-34d5-439b-950f-f5ebdff29c21"
    extId = "BuildFeatures_FileContentReplacerKotlin_Build"
    name = "Build"


    vcs {
        root(BuildFeatures_FileContentReplacerKotlin.vcsRoots.BuildFeatures_FileContentReplacerKotlin_FileContentReplacer)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    features {
        replaceContent {
            fileRules = "**/*.*"
            pattern = "^ccc"
            replacement = "aa"
        }
    }
})

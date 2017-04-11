package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_2 : BuildType({
    uuid = "ed7f69d7-2157-4969-9eff-9ae858082ec8"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_2"
    name = "_Run All_"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_3) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_4) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_5) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})

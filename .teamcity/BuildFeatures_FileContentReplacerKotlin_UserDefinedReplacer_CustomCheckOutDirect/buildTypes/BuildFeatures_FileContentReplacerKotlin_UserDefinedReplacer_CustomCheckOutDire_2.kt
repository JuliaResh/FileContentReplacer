package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_2 : BuildType({
    uuid = "9f079d72-5c7c-444d-8783-804a927a98ce"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_2"
    name = "_Run All_"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_3) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_4) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDirect.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_CustomCheckOutDire_5) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})

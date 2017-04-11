package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Ru : BuildType({
    uuid = "189b8aca-b3d7-4121-b302-5ae9ffdfb118"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Ru"
    name = "_Run All_"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Li) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Ma) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralBuildSteps_Wi) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})

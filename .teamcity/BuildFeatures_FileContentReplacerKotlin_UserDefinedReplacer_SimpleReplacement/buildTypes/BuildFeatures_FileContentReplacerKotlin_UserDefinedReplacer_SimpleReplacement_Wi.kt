package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Wi : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement.buildTypes.BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Si)
    uuid = "28f40d9c-37a3-4852-a668-f6c790212a55"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SimpleReplacement_Wi"
    name = "Windows"

    features {
        replaceContent {
            id = "BUILD_EXT_154"
            fileRules = "file.txt"
            pattern = """(\s)\d{5,6}"""
            replacement = """${'$'}1${'$'}1\22222"""
        }
    }
})

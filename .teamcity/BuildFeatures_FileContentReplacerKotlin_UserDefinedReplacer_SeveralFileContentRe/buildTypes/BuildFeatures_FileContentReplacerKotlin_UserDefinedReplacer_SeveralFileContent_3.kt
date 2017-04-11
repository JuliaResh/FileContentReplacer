package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_3 : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes.Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe)
    uuid = "ef64bc1e-7ccf-48df-9549-4d2212ea4dd0"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_3"
    name = "Linux"

    requirements {
        contains("teamcity.agent.jvm.os.name", "Linux", "RQ_170")
    }
    
    disableSettings("RQ_97")
})

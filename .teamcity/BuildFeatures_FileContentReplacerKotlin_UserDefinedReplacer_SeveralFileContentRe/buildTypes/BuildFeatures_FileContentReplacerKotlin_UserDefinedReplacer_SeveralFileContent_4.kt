package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_4 : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe.buildTypes.Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContentRe)
    uuid = "d92fe713-e0d2-4c32-89d0-310103537627"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_SeveralFileContent_4"
    name = "Mac OS"

    requirements {
        contains("teamcity.agent.jvm.os.name", "Mac", "RQ_144")
    }
    
    disableSettings("RQ_97")
})

package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFil_3 : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI.buildTypes.Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI)
    uuid = "15bb7416-c852-4752-b5a6-fe56d31448fb"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFil_3"
    name = "Mac OS"

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Mac", "RQ_131")
    }
    
    disableSettings("RQ_80")
})

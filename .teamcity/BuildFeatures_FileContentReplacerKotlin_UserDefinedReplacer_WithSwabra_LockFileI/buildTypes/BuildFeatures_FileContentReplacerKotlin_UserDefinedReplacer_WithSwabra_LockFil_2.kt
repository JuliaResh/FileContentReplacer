package BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFil_2 : BuildType({
    template(BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI.buildTypes.Template_BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFileI)
    uuid = "a0152380-5275-4358-8856-8966de47b5b0"
    extId = "BuildFeatures_FileContentReplacerKotlin_UserDefinedReplacer_WithSwabra_LockFil_2"
    name = "Linux"

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Linux", "RQ_107")
    }
    
    disableSettings("RQ_80")
})

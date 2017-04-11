package BuildFeatures_FileContentReplacerKotlin.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object BuildFeatures_FileContentReplacerKotlin_FileContentReplacer : GitVcsRoot({
    uuid = "8cf91e8d-b0f1-4da7-a833-92d2f0ccbd8e"
    extId = "BuildFeatures_FileContentReplacerKotlin_FileContentReplacer"
    name = "File Content Replacer"
    url = "https://github.com/JuliaResh/FileContentReplacer"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxxb4813732520f9587c2fb27cb30cc3e32"
    }
})

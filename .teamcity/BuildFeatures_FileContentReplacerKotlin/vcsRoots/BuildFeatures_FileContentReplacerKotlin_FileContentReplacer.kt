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
        password = "zxx05da2facb88ca3d90cae6c44a16d5b826b2382dfa2eb434292e2f8fe981f0c7f2d866a997a20b492"
    }
})

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
        password = "zxx688a918ef67155109118170e6b41b8bbe969d4ebdd161e9be39592afdea87af884176562d24bcc1dcb9bd2041f818ed633749a34315aae41"
    }
})

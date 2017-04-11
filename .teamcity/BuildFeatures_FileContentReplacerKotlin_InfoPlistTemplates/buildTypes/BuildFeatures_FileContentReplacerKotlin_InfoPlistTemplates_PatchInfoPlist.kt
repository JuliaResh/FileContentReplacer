package BuildFeatures_FileContentReplacerKotlin_InfoPlistTemplates.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.BuildStep
import jetbrains.buildServer.configs.kotlin.v10.BuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.FileContentReplacer.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.replaceContent
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.swabra

object BuildFeatures_FileContentReplacerKotlin_InfoPlistTemplates_PatchInfoPlist : BuildType({
    uuid = "3bf5f6b6-39b9-4d46-8e93-9bd7fb0bbe9f"
    extId = "BuildFeatures_FileContentReplacerKotlin_InfoPlistTemplates_PatchInfoPlist"
    name = "Patch Info.plist"

    artifactRules = "**/* =>"

    vcs {
        root("DirtyConfigurations_XCode_HttpsJuliaReshBitbucketOrgJuliaReshSimplebindingsadopt")

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        step {
            type = "Xcode"
            param("project", "SimpleBindingsAdoption.xcworkspace")
            param("scheme", "MyScheme")
            param("useCustomBuildOutputDir", "true")
            param("xcodePath", "/Applications/Xcode_6_0_1.app/Contents/Developer")
        }
    }

    features {
        replaceContent {
            fileRules = "**/Info.plist"
            pattern = """(\<key\>CFBundleVersion\<\/key\>\s*\<string\>)(\d+\.)*\d+(\<\/string\>)"""
            replacement = """${'$'}1\1.\%build.number%${'$'}3"""
            encoding = FileContentReplacer.FileEncoding.UTF_8
            customEncodingName = "UTF-8"
        }
        replaceContent {
            fileRules = "**/Info.plist"
            pattern = """(\<key\>CFBundleShortVersionString\<\/key\>\s*\<string\>)(\d+\.)*\d+(\<\/string\>)"""
            replacement = """${'$'}1\%build.number%${'$'}3"""
            encoding = FileContentReplacer.FileEncoding.UTF_8
            customEncodingName = "UTF-8"
        }
        swabra {
            forceCleanCheckout = true
        }
    }
})

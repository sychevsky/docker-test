package TestRoot_SychTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*

object SychTestProject : BuildType({
    templates(SychTest_DockerBuid)
    id = AbsoluteId("SychTestProject")
    name = "test project"

    vcs {
        root(SychVcsRootId)
    }
})
#package TestRoot_SychTest.buildTypes
#
#import jetbrains.buildServer.configs.kotlin.v2018_2.*
#
#object SychTestProject : BuildType({
#    templates(SychTest_DockerBuid)
#    id = AbsoluteId("SychTestProject")
#    name = "test project"
#
#    vcs {
#        root(SychVcsRootId)
#    }
#})

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v2018_2.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot'

version = "2018.2"

project {
    vcsRoot(ProjectVcs)
    buildType(Build)
}

object Build : BuildType({

    templates(SychTest_DockerBuid)
    id = AbsoluteId("SychTestProject")
    name = "test project"
})

#object ProjectVcs : GitVcsRoot({
#    name = "ProjectVcs"
#    url = "https://github.com/spring-projects/spring-Project.git"
#})
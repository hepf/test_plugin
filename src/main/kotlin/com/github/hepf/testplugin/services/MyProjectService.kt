package com.github.hepf.testplugin.services

import com.intellij.openapi.project.Project
import com.github.hepf.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

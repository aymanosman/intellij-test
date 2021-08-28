package com.github.aymanosman.intellijtest.services

import com.github.aymanosman.intellijtest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

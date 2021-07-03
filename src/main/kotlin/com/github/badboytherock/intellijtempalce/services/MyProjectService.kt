package com.github.badboytherock.intellijtempalce.services

import com.github.badboytherock.intellijtempalce.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.cesarrichard.unicornprogressbar.services

import com.intellij.openapi.project.Project
import com.github.cesarrichard.unicornprogressbar.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

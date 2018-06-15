package com.openxu.localplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class LocalPlugin implements Plugin<Project> {

    void apply(Project project) {
        //println("...") == System.out.println("...")
        println("********************hello LocalPlugin*********************")
        project.task('B_LocalPluginTask1') << {
            println '**************************task LocalPluginTask1**************************'
        }
    }
}
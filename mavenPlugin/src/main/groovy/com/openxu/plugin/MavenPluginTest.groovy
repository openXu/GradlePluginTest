package com.openxu.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MavenPluginTest implements Plugin<Project> {

    void apply(Project project) {
        //println("...") == System.out.println("...")
        println("^^^^^^^^^^^^^^^^^^^^^^^^^^hello MavenPluginTest^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    }
}
tasks.register("myTask1") {
    description = "myTask1 description"
    doFirst { println("myTask1 doFirst") }
    doLast { println("myTask1 doLast") }
}

tasks.register("clean-all") {
    description = "Clean all temp files."
    doFirst {
        var dotGradleDir: File = project.rootProject.file("./.gradle/")
        println("clean-all " + dotGradleDir)
        var fileTreeWalk: FileTreeWalk = dotGradleDir.walk()
        fileTreeWalk
            .onLeave {
                it.delete()
                it.deleteOnExit()
            }
            .forEach {
                println(it.absolutePath)
                it.delete()
                it.deleteOnExit()
            }
    }
    doLast { println("clean-all doLast") }
}

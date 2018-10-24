package com.quick

import javafx.application.Application
import tornadofx.App

class StudentTableApp : App() {
    override val primaryView = StudentTableView::class
}

fun main(args: Array<String>) {
    Application.launch(StudentTableApp::class.java, *args)
}
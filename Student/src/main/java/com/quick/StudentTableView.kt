package com.quick

import javafx.collections.FXCollections
import javafx.scene.layout.GridPane
import tornadofx.*

class StudentTableView : View() {
    override val root = GridPane()
    val students = FXCollections.observableArrayList(
            Student("Hank", 66, 90),
            Student("Jack", 88,77),
            Student("Jane", 95, 86)
    )
    init {
        with(root) {
            row {
                vbox {
                    label {"Student table"}
                    tableview(students) {
                        column("name", Student::name)
                        column("English", Student::english)
                        column("Math", Student::math)
                        column("Average", Student::average)
                        resizeColumnsToFitContent()
                    }
                }
            }
        }
    }
}
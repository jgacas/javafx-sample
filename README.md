# JavaFX sample project

This is a "Hello World" JavaFX project. Every time button is clicked "Hello World!" will be logged in the console.

## Setup

Project setup is very opinionated because its sole purpose is education and fun. To quickly set it up you will need:
 - OpenJDK 11
 - Eclipse SimRel 2019-09
 
Setup steps:
 - clone repository
 - import as maven project in Eclipse
 - add OpenJDK 11 to Installed JREs in Eclipse - *Window->Preferences->Installed JREs*
 - update maven project - right click on project root, *Maven->Update Project...*
 - add VM arguments ro Run Configuration - right click on project root, *Run As->Run Configurations...*, in *Arguments* tab add ```--module-path ${project_classpath:javafx-sample} --add-modules javafx.controls``` to *VM arguments*
 
Run application:
 - right click on project root, *Run as->Java Application*
 
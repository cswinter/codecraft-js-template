# CodeCraft.js Example

Example template for a CodeCraft application that uses Scala.js to target the browser.
This can be a useful as a workaround in cases where the OpenGL graphics don't display properly on the JVM.

Running `sbt fastOptJS` will compile and generate the JavaScript.
To start the program, open/refresh `file:///$PROJECT_PATH/target/scala-2.11/classes/index.html` in a browser (Chrome tends to work best).


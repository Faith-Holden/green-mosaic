# green-mosaic

My solution for Chapter 4 Exercise 6 of “Introduction to Programming Using Java”.
Notes on implementation: For this exercise, I replaced the "changeToRandomColor" method with a "changeGreenLevel" method and changed "3D effect" status to false.

NOTE: This is a javafx program. It requires the javafx library as a dependency. (See bottom of this README for javafx instructions).

Problem Description:
The sample program RandomMosaicWalk.java from Section 4.7 shows a “disturbance”
that wanders around a grid of colored squares. When the disturbance visits a square,
the color of that square is changed. Here’s an idea for a variation on that program. In
the new version, all the squares start out with the default color, black. Every time the
disturbance visits a square, a small amount is added to the green component of the color
of that square. The result will be a visually interesting effect, as the path followed by the
disturbance gradually turns a brighter and brighter green.
Write a subroutine that will add 25 to the green component of one of the squares in the
mosaic. (But don’t let the green component go over 255, since that’s the largest legal value
for a color component.) The row and column numbers of the square should be given as
parameters to the subroutine. Recall that you can discover the current green component
of the square in row r and column c with the function call Mosaic.getGreen(r,c). Use
your subroutine as a substitute for the changeToRandomColor() subroutine in the program
RandomMosaicWalk2.java. (This is the improved version of the program from Section 4.8
that uses named constants for the number of rows, number of columns, and square size.)
Set the number of rows and the number of columns to 80. Set the square size to 5.
By default, the rectangles in the mosaic have a “3D” appearance and a gray border
that makes them look nicer in the random walk program. But for this program, you
want to turn off that effect. To do so, call Mosaic.setUse3DEffect(false) in the main
program.
Don’t forget that you will need Mosaic.java and MosaicCanvas.java to compile and run
your program, since they define non-standard classes that are required by the program.


Javafx setup instructions:
Download javafx from: https://gluonhq.com/products/javafx/ (I used javafx 12). Save it to a location of your choice.
Unpack the zip folder.
Open my project with your IDE of choice (I use intellij IDEA).
Add the javafx/lib folder as an external library for the project. For intellij, this means going to "project structure" -> "libraries" -> "add library" ->{javafx location}/lib
Add the following as a VM argument for the project: --module-path "{full path to your javafx/lib folder}" --add-modules javafx.controls,javafx.fxml,javafx.base,javafx.graphics,javafx.media,javafx.swing,javafx.web
Build and run the project as normal.

NOTE: The Mosaic.java and MosaicCanvas.java classes were written by the textbook's author. Much of the implementation of RandomMosaicExtinction.java was also written by the author -- my edits are notated with comments.

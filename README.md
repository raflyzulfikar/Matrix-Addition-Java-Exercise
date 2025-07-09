# Java Exercise: Matrix Addition (Two-Dimensional Array)
## Project Description
This project is a simple Java program designed to add two matrices (two-dimensional arrays) of the same size and display their sum. The program creates two 2x2 matrices, populates them with random numbers, performs element-wise addition, and then displays all three matrices (Matrix A, Matrix B, and the Resulting Sum Matrix) in a neat table format on the console.
## Functionality
* Creates two two-dimensional arrays (matrices) of the same predefined size (currently 2x2).
* Fills both matrices with random integer values.
* Performs element-wise addition between the two matrices.
* Creates a third matrix to store the sum result.
* Displays the first matrix, the second matrix, and the resulting sum matrix in a table format.
## How It Works
1.  The program initializes two matrices, `matrixA` and `matrixB`, as well as a `resultMatrix`, all with a size of 2x2.
2.  Using the `Random` object, elements of both `matrixA` and `matrixB` are filled with random integer numbers between 1 and 10.
3.  The addition operation is performed by iterating (looping) through each element in `matrixA` and `matrixB`, summing them, and storing the result in `resultMatrix` at the corresponding position.
4.  `matrixA`, `matrixB`, and `resultMatrix` are then printed to the console using the `printMatrix` helper method, which is designed for neat table display.
## Project Structure
This project consists of a single Java file:
```
.
└── src/
└── latihan4.java
└── README.md
```
## Usage Example (Console Output)
Here is an example of how the program output looks on the console. Since the matrix values are generated randomly, the numbers you see will vary each time the program is run.
```
Matriks A: 
   8   7
   4  10
Matriks B: 
   2   3
   5   9

Hasil penjumlahan:
  10  10
   9  19
```
*(The matrix values and total sum will differ each time the program is run because it uses `Random`.)*
## How to Run the Project
To run this program, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Prepare Files**
    Make sure the `latihan4.java` file is inside the `src/` folder within your project directory.
2.  **Compile Code**
    Open your terminal or Command Prompt, navigate to the root directory of your project (the folder where `src/` and `README.md` are located), and compile the Java file:
    ```
    javac src/latihan4.java
    ```
3.  **Run the Program**
    Once successfully compiled, you can run the program:
    ```
    java -cp src latihan4
    ```

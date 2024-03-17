# Binary Search Tree (BST) Project

This project implements a Binary Search Tree (BST) in Java, focusing on the essential operations such as tree construction, in-order traversal, and search functionality. It demonstrates the efficiency and functionality of BSTs for storing and retrieving data in a structured manner. Developed in IntelliJ IDEA, this project is structured to provide a clear understanding of BST operations and their performance analysis.

## Project Structure

The project is divided into three main classes:

- `Node.java`: Defines the structure of each node in the BST, including the key, data, and references to left and right child nodes.
- `BinarySearchTree.java`: Implements the BST with methods for inserting nodes, performing an in-order traversal, and searching for nodes by key.
- `Main.java`: Contains the main method to run the application, demonstrating the construction of the BST from a file, in-order traversal, and searching for specific nodes. It also includes performance analysis for these operations.

## Features

- **Tree Construction**: Build a BST by inserting nodes from a CSV file, allowing for a dynamic and scalable way to populate the tree.
- **In-Order Traversal**: Traverse the tree in an in-order manner to print all nodes in ascending order based on their keys.
- **Search**: Implement a search function to find a node by its key, showcasing the efficiency of BSTs for data retrieval.
- **Performance Analysis**: Analyze and print the time taken for tree construction, traversal, and search operations in nanoseconds, providing insight into the efficiency of BST operations.

## Requirements

- Java Development Kit (JDK) 20 or above.
- IntelliJ IDEA (Community or Ultimate Edition) for project setup and execution.

## Setup and Execution

1. **Clone the Repository**: Clone or download this project to your local machine.
2. **Open Project in IntelliJ IDEA**:
   - Launch IntelliJ IDEA.
   - Select "Open" and navigate to the project directory.
   - Choose the project directory and click "OK" to open the project.
3. **Build the Project**:
   - Navigate to "Build" > "Build Project" to compile the project.
4. **Run the Application**:
   - Right-click on `Main.java` in the project explorer.
   - Select "Run 'Main.main()'" to execute the program.
5. **View Results**:
   - The application will print the results of the operations (tree construction, traversal, and search) in the IntelliJ IDEA console, including the performance analysis.

## Customizing the Project

- **Data Input**: Modify `UPC.csv` and `input.dat` files to include your data for tree construction and search operations, respectively. Ensure the data format is consistent with the project's parsing logic.
- **Enhancements**: Consider extending the project by implementing additional BST operations such as deletion, finding the minimum and maximum elements, and balancing the tree.

## Contribution

Contributions to improve this project are welcome. Please feel free to fork the repository, make changes, and submit pull requests.

## License

This project is open-sourced under the MIT License. See the LICENSE file for more details.

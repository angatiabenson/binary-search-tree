import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Long> timeAnalysis;
    public static void main(String[] args) {
        try {
            BinarySearchTree tree = new BinarySearchTree();
            timeAnalysis = new ArrayList<>();
            // Load the tree from the file
            buildTreeFromFile(tree, "UPC.csv");
            // Perform and measure the time of the in-order traversal
            performTraversal(tree);
            // Search for keys in the tree based on input file
            performSearches(tree, "input.dat");

            System.out.println("\n\n**** TIME ANALYSIS (nanoseconds) ****");
            System.out.println("\t- Tree building time: "+timeAnalysis.get(0));
            System.out.println("\t- Tree traversal time: "+timeAnalysis.get(1));
            System.out.println("\t- Tree search time: "+timeAnalysis.get(2));

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private static void buildTreeFromFile(BinarySearchTree tree, String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        long totalTime = 0;
        while (scanner.hasNextLine()) {
            String[] elements = scanner.nextLine().split(",");
            Node node = new Node(Long.parseLong(elements[0]), elements[2]);
            long startTime = System.nanoTime();
            tree.treeInsert(node);
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        scanner.close();
        System.out.println("\n**** BUILD COMPLETE ****");
        System.out.printf("Total time to build the tree: %d nanoseconds.%n", totalTime);
        timeAnalysis.add(totalTime);
    }

    private static void performSearches(BinarySearchTree tree, String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        ArrayList<Node> searchResults = new ArrayList<Node>();
        long totalTime = 0;
        while (scanner.hasNextLine()) {
            String[] elements = scanner.nextLine().split(",");
            long key = Long.parseLong(elements[0]);
            long startTime = System.nanoTime();
            Node result = tree.treeSearch(tree.root, key);
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
            searchResults.add(result);
        }
        System.out.println("\n**** SEARCH COMPLETE ****");
        System.out.printf("Found %d items:\n",searchResults.size());
        for (Node result:searchResults){
            System.out.println("\t- "+result.data);
        }
        scanner.close();
        System.out.printf("%nTotal time for searching: %d nanoseconds.%n", totalTime);
        timeAnalysis.add(totalTime);
    }

    private static void performTraversal(BinarySearchTree tree) {
        long startTime = System.nanoTime();
        System.out.println("In-order traversal:");
        tree.inOrderTreeWalk(tree.root);
        long endTime = System.nanoTime();
        System.out.println("\n**** IN-ORDER TRAVERSAL COMPLETE ****");
        System.out.printf("%nTime taken for in-order traversal: %d nanoseconds.%n", (endTime - startTime));
        timeAnalysis.add((endTime - startTime));
    }
}

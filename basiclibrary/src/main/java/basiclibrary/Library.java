/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {
    public boolean someLibraryMethod() {
        return true;

        roll( 4);
    }

    public static int[] roll ( int n) {
        int[] rollAnswer = new int[n];

        for (int i = 0; i < n ; i++) {
            rollAnswer = Random(i);
            System.out.println(rollAnswer);
        }
    }


}




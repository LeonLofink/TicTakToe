import javax.swing.*;

public class MainController {
    private int[][] array = {
            {1,2,3},
            {4,5,6}
    };
    private int[][] spielfeld = new int[3][3];

    public static void main(String[] args) {
        new MainController();
    }

    public MainController() {
        new Window(this);
        new JFrame();
        System.out.println(findeGroessteZahl());
    }
    public int findeGroessteZahl(){
        int x = 0;
        array[0][1] = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            x = array[0][1];
        }
        return x;
    }

}
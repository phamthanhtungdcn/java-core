//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] list = {5,7,1,3};
        int max = 5;
        int temp;
        for (int i = 0; i < list.length; i++) {
            if(list[i] > max){
                temp = list[i];
                list[i] = max;
                max = temp;
            }

            System.out.println(list[i]);
        }
    }
}
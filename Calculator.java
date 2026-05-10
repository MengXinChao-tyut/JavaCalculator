//这是小明写的计算机
//这是我写的计算机核心逻辑
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 创建扫描器，用于接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入第一个数字
        System.out.print("请输入第一个数字：");
        double num1 = scanner.nextDouble();

        // 提示用户输入第二个数字
        System.out.print("请输入第二个数字：");
        double num2 = scanner.nextDouble();

        // 提示选择运算方式
        System.out.println("请选择运算：");
        System.out.println("1 —— 加法");
        System.out.println("2 —— 减法");
        System.out.print("请输入选项（1/2）：");
        int choice = scanner.nextInt();

        double result; // 存放计算结果

        // 根据选择执行加减运算
        if (choice == 1) {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else {
            // 输入错误提示
            System.out.println("输入错误！只能选择 1 或 2");
        }

        // 关闭扫描器
        scanner.close();
    }
}
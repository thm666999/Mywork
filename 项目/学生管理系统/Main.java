import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentUtil util = new StudentUtil();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 学生管理系统 =====");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查询所有学生");
            System.out.println("5. 退出");
            System.out.print("请输入选项：");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("输入学号：");
                    String id = sc.nextLine();
                    System.out.print("输入姓名：");
                    String name = sc.nextLine();
                    System.out.print("输入年龄：");
                    int age = sc.nextInt();
                    util.addStudent(new Student(id, name, age));
                    System.out.println("添加成功！");
                    break;
                case 2:
                    System.out.print("输入要删除的学号：");
                    String delId = sc.nextLine();
                    util.deleteStudent(delId);
                    System.out.println("删除成功！");
                    break;
                case 3:
                    System.out.print("输入要修改的学号：");
                    String upId = sc.nextLine();
                    System.out.print("输入新姓名：");
                    String newName = sc.nextLine();
                    System.out.print("输入新年龄：");
                    int newAge = sc.nextInt();
                    util.updateStudent(new Student(upId, newName, newAge));
                    System.out.println("修改成功！");
                    break;
                case 4:
                    System.out.println("\n学生列表：");
                    for (Student s : util.findAll()) {
                        System.out.println(s);
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入错误！");
            }
        }
    }
}
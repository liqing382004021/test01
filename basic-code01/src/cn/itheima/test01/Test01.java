package cn.itheima.test01;

import java.util.Scanner;

public class Test01 {
    //21、
    //提示用户输入一串字符串(不包含空格)，分别统计出其中英文字母,数字和其他字符的个数并打印出来，
    // 如下图所示：
    public static void main(String[] args) {
        System.out.println("提示用户输入一串字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z') {
                count1++;
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("英文字母个数"+count1);
        System.out.println("数字个数"+count2);
        System.out.println("其他字符个数"+count3);
    }
}

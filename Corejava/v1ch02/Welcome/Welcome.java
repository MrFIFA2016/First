import static java.lang.Math.*;
import java.lang.System;

import java.util.*;

/**
 * 
 * @author 13583
 * @see
 *
 */
public class Welcome {
    public static void main(String[] args) {
	/*
	 * String[] greeting = new String[3]; greeting[0] =
	 * "Welcome to Core Java"; greeting[1] = "by Cay Horstmann"; greeting[2]
	 * = "and Gary Cornell";
	 * 
	 * for (String g : greeting) System.out.println(g); int i = 0; i =
	 * 100_00_00; char c = '\u005B'; System.out.println(1 == 12 && (1 / 0 ==
	 * 3)); System.out.println(sqrt(12)); String string = "aa";
	 * StringBuilder builder = new StringBuilder(); builder.append("aa");
	 * Scanner scanner = new Scanner(System.in); int i2 = scanner.nextInt();
	 * scanner.close();
	 */
	// Welcome welcome=new Welcome();
	NameCls cls = new NameCls();
	cls.Do();
    }
}

class NameCls {
    // public NameCls() {
    // char c = 'a';
    // }
    {
	System.out.println("��ʼ��");
    }

    public void Do() {
	System.out.println("���");
    }
}

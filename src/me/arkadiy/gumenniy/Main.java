package me.arkadiy.gumenniy;

import me.arkadiy.gumenniy.modifier.Modifier;
import me.arkadiy.gumenniy.modifier.Reverser;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Modifier reverser = new Logarithmer(new Reverser());
        System.out.println(reverser.modify(100));
        System.out.println(reverser.modify(900));
        System.out.println(reverser.modify(901));
    }
}

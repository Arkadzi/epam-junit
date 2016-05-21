package me.arkadiy.gumenniy.modifier;

import me.arkadiy.gumenniy.modifier.Modifier;

/**
 * Created by Arkadiy on 21.05.2016.
 */
public class Reverser implements Modifier {
    @Override
    public Integer modify(int number) {
        if (number > 999 || number < 100) {
            throw new IllegalArgumentException("Wrong argument. Should be in [100;999]");
        }
        return 100 * (number % 10) + number / 100 + 10 * ((number / 10) % 10);
    }
}

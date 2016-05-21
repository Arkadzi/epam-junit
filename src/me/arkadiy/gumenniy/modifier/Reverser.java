package me.arkadiy.gumenniy.modifier;

/**
 * Class which reverses three-digit number
 */
public class Reverser implements Modifier {
    /**
     * reverses three-digit value
     * if number is < 100 or > 999 - throws {@link IllegalArgumentException}
     *
     * @param number modifiable value
     * @return reversed  integer number
     */
    @Override
    public Integer modify(int number) {
        if (number > 999 || number < 100) {
            throw new IllegalArgumentException("Wrong argument. Should be in [100;999]");
        }
        return 100 * (number % 10) + number / 100 + 10 * ((number / 10) % 10);
    }
}

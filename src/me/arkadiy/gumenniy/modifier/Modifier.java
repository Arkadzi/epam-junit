package me.arkadiy.gumenniy.modifier;

/**
 * Interface witch gives ability to modify int value in some way
 */
public interface Modifier {
    /**
     * modifies int value to some number
     *
     * @param number modifiable value
     * @return modified valie
     */
    Number modify(int number);
}

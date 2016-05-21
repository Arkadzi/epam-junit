package me.arkadiy.gumenniy.modifier;

/**
 * Created by Arkadiy on 21.05.2016.
 */
public class Logarithmer implements Modifier {
    private Modifier modifier;

    public Logarithmer(Modifier modifier) {
        this.modifier = modifier;
    }

    @Override
    public Double modify(int number) {
        return Math.log(modifier.modify(number).doubleValue());
    }
}

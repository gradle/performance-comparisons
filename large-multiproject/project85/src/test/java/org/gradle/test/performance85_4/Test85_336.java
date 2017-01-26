package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_336 {
    private final Production85_336 production = new Production85_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
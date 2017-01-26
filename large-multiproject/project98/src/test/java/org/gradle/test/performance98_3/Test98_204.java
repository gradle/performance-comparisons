package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_204 {
    private final Production98_204 production = new Production98_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
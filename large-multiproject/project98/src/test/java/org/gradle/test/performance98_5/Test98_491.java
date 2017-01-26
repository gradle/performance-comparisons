package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_491 {
    private final Production98_491 production = new Production98_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_439 {
    private final Production15_439 production = new Production15_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
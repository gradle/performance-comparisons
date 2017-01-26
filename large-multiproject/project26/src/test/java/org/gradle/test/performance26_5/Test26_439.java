package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_439 {
    private final Production26_439 production = new Production26_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
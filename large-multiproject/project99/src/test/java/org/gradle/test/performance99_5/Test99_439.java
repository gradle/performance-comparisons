package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_439 {
    private final Production99_439 production = new Production99_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
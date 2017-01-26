package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_439 {
    private final Production90_439 production = new Production90_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
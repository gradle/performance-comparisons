package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_439 {
    private final Production14_439 production = new Production14_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
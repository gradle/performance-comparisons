package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_439 {
    private final Production72_439 production = new Production72_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
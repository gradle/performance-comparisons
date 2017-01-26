package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_439 {
    private final Production18_439 production = new Production18_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
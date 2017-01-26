package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_292 {
    private final Production98_292 production = new Production98_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
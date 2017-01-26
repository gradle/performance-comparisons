package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_117 {
    private final Production98_117 production = new Production98_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
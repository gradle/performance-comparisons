package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_245 {
    private final Production98_245 production = new Production98_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
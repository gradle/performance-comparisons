package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_478 {
    private final Production98_478 production = new Production98_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
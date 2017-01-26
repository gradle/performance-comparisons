package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_376 {
    private final Production98_376 production = new Production98_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
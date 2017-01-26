package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_456 {
    private final Production98_456 production = new Production98_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
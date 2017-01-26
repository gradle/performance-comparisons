package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_456 {
    private final Production48_456 production = new Production48_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
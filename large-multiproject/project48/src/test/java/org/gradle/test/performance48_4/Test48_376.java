package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_376 {
    private final Production48_376 production = new Production48_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
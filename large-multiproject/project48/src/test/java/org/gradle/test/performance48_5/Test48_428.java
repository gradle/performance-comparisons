package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_428 {
    private final Production48_428 production = new Production48_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
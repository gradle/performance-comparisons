package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_459 {
    private final Production48_459 production = new Production48_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
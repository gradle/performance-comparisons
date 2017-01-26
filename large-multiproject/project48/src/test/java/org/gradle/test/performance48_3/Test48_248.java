package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_248 {
    private final Production48_248 production = new Production48_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
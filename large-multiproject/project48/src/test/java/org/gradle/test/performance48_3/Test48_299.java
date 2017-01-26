package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_299 {
    private final Production48_299 production = new Production48_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
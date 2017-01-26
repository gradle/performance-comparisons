package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_292 {
    private final Production48_292 production = new Production48_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
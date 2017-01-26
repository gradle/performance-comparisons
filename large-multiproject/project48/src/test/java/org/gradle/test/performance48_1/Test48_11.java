package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_11 {
    private final Production48_11 production = new Production48_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
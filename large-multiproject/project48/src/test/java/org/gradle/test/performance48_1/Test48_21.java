package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_21 {
    private final Production48_21 production = new Production48_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
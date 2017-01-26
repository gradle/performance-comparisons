package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_412 {
    private final Production48_412 production = new Production48_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
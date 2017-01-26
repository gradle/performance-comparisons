package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_240 {
    private final Production48_240 production = new Production48_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
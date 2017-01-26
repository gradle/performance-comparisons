package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_141 {
    private final Production48_141 production = new Production48_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
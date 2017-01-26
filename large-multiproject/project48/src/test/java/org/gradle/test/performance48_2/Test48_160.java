package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_160 {
    private final Production48_160 production = new Production48_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
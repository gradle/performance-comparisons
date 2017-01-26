package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_298 {
    private final Production48_298 production = new Production48_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
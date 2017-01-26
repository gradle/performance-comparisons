package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_233 {
    private final Production48_233 production = new Production48_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
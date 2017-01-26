package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_328 {
    private final Production48_328 production = new Production48_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
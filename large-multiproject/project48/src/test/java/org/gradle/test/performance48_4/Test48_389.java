package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_389 {
    private final Production48_389 production = new Production48_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_374 {
    private final Production48_374 production = new Production48_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
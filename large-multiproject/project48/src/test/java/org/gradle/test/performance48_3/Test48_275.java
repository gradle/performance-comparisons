package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_275 {
    private final Production48_275 production = new Production48_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
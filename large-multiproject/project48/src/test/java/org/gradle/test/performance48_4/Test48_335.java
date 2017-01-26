package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_335 {
    private final Production48_335 production = new Production48_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
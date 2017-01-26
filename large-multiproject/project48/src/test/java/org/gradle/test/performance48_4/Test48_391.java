package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_391 {
    private final Production48_391 production = new Production48_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
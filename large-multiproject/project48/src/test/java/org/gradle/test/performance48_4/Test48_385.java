package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_385 {
    private final Production48_385 production = new Production48_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
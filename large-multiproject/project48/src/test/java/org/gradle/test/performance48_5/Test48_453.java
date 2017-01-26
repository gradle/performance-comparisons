package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_453 {
    private final Production48_453 production = new Production48_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
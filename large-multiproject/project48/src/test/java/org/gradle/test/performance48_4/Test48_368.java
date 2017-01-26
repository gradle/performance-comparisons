package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_368 {
    private final Production48_368 production = new Production48_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
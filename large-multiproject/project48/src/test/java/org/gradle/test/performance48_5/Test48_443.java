package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_443 {
    private final Production48_443 production = new Production48_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
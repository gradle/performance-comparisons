package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_410 {
    private final Production48_410 production = new Production48_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
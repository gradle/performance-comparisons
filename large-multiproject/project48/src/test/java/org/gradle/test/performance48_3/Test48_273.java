package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_273 {
    private final Production48_273 production = new Production48_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
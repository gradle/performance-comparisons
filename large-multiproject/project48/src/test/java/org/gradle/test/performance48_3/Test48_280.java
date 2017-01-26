package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_280 {
    private final Production48_280 production = new Production48_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
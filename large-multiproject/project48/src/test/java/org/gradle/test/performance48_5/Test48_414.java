package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_414 {
    private final Production48_414 production = new Production48_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
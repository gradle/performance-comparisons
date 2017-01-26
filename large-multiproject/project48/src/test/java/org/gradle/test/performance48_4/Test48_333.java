package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_333 {
    private final Production48_333 production = new Production48_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
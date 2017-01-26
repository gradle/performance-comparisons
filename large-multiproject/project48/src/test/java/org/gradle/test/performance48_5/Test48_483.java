package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_483 {
    private final Production48_483 production = new Production48_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
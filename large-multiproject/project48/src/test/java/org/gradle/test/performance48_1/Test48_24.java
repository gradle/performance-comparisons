package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_24 {
    private final Production48_24 production = new Production48_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
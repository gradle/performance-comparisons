package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_101 {
    private final Production48_101 production = new Production48_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
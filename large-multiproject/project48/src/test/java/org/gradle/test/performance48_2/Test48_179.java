package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_179 {
    private final Production48_179 production = new Production48_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
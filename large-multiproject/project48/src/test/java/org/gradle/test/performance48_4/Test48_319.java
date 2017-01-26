package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_319 {
    private final Production48_319 production = new Production48_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
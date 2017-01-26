package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_153 {
    private final Production48_153 production = new Production48_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
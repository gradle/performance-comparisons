package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_130 {
    private final Production48_130 production = new Production48_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
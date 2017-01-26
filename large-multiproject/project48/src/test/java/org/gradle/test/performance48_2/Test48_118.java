package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_118 {
    private final Production48_118 production = new Production48_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_125 {
    private final Production48_125 production = new Production48_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
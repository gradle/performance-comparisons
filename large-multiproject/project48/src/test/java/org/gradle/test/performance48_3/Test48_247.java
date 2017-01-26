package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_247 {
    private final Production48_247 production = new Production48_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
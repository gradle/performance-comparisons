package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_121 {
    private final Production48_121 production = new Production48_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
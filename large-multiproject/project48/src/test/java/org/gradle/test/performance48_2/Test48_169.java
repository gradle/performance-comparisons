package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_169 {
    private final Production48_169 production = new Production48_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
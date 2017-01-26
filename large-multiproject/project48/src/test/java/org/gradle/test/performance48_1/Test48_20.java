package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_20 {
    private final Production48_20 production = new Production48_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
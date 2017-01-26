package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_345 {
    private final Production48_345 production = new Production48_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
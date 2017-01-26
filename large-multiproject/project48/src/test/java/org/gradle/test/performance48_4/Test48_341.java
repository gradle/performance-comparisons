package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_341 {
    private final Production48_341 production = new Production48_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
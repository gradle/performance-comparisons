package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_334 {
    private final Production48_334 production = new Production48_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
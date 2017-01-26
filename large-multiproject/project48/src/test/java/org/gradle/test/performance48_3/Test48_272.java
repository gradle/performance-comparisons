package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_272 {
    private final Production48_272 production = new Production48_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
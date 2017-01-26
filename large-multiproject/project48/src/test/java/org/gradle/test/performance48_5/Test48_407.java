package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_407 {
    private final Production48_407 production = new Production48_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
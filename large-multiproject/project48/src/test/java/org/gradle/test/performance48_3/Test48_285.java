package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_285 {
    private final Production48_285 production = new Production48_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
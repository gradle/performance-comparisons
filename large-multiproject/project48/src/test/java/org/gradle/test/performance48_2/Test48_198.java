package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_198 {
    private final Production48_198 production = new Production48_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
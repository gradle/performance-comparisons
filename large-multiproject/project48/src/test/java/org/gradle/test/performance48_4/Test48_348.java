package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_348 {
    private final Production48_348 production = new Production48_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
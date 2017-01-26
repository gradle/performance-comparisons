package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_420 {
    private final Production48_420 production = new Production48_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_394 {
    private final Production48_394 production = new Production48_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
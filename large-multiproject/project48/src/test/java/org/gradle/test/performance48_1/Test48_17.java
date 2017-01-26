package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_17 {
    private final Production48_17 production = new Production48_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
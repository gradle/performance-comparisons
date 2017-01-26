package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_17 {
    private final Production80_17 production = new Production80_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
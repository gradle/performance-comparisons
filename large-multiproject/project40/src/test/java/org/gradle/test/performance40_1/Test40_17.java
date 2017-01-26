package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_17 {
    private final Production40_17 production = new Production40_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
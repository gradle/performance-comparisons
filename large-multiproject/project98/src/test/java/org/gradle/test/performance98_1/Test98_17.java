package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_17 {
    private final Production98_17 production = new Production98_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
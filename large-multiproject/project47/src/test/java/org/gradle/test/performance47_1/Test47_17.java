package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_17 {
    private final Production47_17 production = new Production47_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
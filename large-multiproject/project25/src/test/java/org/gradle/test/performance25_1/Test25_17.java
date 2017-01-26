package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_17 {
    private final Production25_17 production = new Production25_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
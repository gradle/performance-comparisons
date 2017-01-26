package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_17 {
    private final Production84_17 production = new Production84_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
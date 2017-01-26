package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_17 {
    private final Production41_17 production = new Production41_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
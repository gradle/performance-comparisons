package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_17 {
    private final Production88_17 production = new Production88_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
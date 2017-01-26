package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_17 {
    private final Production4_17 production = new Production4_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
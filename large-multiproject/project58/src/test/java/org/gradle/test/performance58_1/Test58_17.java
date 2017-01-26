package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_17 {
    private final Production58_17 production = new Production58_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
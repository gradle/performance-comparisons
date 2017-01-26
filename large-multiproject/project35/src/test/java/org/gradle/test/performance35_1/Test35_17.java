package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_17 {
    private final Production35_17 production = new Production35_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_17 {
    private final Production93_17 production = new Production93_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_17 {
    private final Production83_17 production = new Production83_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
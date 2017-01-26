package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_17 {
    private final Production37_17 production = new Production37_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
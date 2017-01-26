package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_17 {
    private final Production24_17 production = new Production24_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
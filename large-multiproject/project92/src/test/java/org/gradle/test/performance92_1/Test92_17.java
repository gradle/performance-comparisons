package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_17 {
    private final Production92_17 production = new Production92_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
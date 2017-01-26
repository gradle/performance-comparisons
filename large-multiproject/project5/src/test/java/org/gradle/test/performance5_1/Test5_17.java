package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_17 {
    private final Production5_17 production = new Production5_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
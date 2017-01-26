package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_17 {
    private final Production20_17 production = new Production20_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
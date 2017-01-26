package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_17 {
    private final Production16_17 production = new Production16_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
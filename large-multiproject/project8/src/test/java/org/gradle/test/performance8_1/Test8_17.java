package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_17 {
    private final Production8_17 production = new Production8_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
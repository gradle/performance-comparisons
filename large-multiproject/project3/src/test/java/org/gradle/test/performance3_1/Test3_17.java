package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_17 {
    private final Production3_17 production = new Production3_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_17 {
    private final Production50_17 production = new Production50_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
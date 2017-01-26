package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_17 {
    private final Production44_17 production = new Production44_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_128 {
    private final Production44_128 production = new Production44_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
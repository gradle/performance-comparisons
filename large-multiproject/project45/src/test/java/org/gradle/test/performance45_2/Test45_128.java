package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_128 {
    private final Production45_128 production = new Production45_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
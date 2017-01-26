package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_128 {
    private final Production69_128 production = new Production69_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
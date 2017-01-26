package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_128 {
    private final Production67_128 production = new Production67_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
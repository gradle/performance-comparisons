package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_128 {
    private final Production62_128 production = new Production62_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
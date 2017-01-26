package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_128 {
    private final Production38_128 production = new Production38_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
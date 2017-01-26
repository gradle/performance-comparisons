package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_128 {
    private final Production9_128 production = new Production9_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
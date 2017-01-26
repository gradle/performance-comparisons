package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_128 {
    private final Production14_128 production = new Production14_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_128 {
    private final Production1_128 production = new Production1_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
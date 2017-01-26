package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_128 {
    private final Production29_128 production = new Production29_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
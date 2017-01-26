package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_128 {
    private final Production99_128 production = new Production99_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
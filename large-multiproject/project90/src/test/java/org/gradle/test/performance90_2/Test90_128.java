package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_128 {
    private final Production90_128 production = new Production90_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_128 {
    private final Production11_128 production = new Production11_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
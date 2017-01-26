package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_128 {
    private final Production79_128 production = new Production79_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
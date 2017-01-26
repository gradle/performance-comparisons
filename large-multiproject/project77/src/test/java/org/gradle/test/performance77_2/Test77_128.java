package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_128 {
    private final Production77_128 production = new Production77_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
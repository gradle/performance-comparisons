package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_128 {
    private final Production73_128 production = new Production73_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
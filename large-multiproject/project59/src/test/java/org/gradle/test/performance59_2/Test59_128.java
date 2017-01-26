package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_128 {
    private final Production59_128 production = new Production59_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
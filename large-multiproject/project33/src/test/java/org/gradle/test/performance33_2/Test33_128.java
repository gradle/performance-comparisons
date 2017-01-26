package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_128 {
    private final Production33_128 production = new Production33_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
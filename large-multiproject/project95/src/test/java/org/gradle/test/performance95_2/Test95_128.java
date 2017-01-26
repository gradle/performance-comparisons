package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_128 {
    private final Production95_128 production = new Production95_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
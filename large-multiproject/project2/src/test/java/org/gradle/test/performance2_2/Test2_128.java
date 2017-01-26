package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_128 {
    private final Production2_128 production = new Production2_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
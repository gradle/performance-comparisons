package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_128 {
    private final Production56_128 production = new Production56_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
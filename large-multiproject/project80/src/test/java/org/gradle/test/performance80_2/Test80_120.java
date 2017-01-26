package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_120 {
    private final Production80_120 production = new Production80_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_383 {
    private final Production31_383 production = new Production31_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
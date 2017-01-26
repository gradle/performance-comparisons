package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_262 {
    private final Production31_262 production = new Production31_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
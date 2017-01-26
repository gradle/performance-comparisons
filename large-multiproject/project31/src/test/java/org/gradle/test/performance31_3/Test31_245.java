package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_245 {
    private final Production31_245 production = new Production31_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
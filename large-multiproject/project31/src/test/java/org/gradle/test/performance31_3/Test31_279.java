package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_279 {
    private final Production31_279 production = new Production31_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_298 {
    private final Production31_298 production = new Production31_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
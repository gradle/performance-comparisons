package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_233 {
    private final Production31_233 production = new Production31_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
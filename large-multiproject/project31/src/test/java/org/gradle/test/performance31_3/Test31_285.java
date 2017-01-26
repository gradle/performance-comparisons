package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_285 {
    private final Production31_285 production = new Production31_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
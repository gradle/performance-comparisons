package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_328 {
    private final Production31_328 production = new Production31_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_478 {
    private final Production31_478 production = new Production31_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
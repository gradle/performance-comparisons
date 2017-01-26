package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_272 {
    private final Production31_272 production = new Production31_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
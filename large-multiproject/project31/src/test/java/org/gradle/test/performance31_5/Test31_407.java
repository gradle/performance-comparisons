package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_407 {
    private final Production31_407 production = new Production31_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
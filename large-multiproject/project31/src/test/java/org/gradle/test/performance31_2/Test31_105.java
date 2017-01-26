package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_105 {
    private final Production31_105 production = new Production31_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
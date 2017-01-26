package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_130 {
    private final Production31_130 production = new Production31_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
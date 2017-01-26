package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_391 {
    private final Production31_391 production = new Production31_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
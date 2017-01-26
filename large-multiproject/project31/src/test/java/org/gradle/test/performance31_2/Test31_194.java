package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_194 {
    private final Production31_194 production = new Production31_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_185 {
    private final Production31_185 production = new Production31_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
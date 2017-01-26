package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_240 {
    private final Production31_240 production = new Production31_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
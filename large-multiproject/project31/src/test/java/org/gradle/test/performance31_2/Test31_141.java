package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_141 {
    private final Production31_141 production = new Production31_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
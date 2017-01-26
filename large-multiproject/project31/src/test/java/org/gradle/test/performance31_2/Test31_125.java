package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_125 {
    private final Production31_125 production = new Production31_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_118 {
    private final Production31_118 production = new Production31_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
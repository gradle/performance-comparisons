package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_292 {
    private final Production31_292 production = new Production31_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
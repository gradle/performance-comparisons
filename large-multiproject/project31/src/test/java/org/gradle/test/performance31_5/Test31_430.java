package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_430 {
    private final Production31_430 production = new Production31_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
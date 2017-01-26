package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_408 {
    private final Production31_408 production = new Production31_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
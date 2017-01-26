package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_448 {
    private final Production31_448 production = new Production31_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
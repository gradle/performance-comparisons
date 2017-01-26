package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_153 {
    private final Production31_153 production = new Production31_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
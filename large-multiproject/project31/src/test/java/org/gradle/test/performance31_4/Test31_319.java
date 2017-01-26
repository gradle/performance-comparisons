package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_319 {
    private final Production31_319 production = new Production31_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
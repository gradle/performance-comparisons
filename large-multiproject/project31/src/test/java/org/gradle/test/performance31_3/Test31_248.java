package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_248 {
    private final Production31_248 production = new Production31_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_359 {
    private final Production31_359 production = new Production31_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
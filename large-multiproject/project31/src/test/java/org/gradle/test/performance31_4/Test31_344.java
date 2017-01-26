package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_344 {
    private final Production31_344 production = new Production31_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
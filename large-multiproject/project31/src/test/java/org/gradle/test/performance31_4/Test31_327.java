package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_327 {
    private final Production31_327 production = new Production31_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
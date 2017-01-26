package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_332 {
    private final Production31_332 production = new Production31_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
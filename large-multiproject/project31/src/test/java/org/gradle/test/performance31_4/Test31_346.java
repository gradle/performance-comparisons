package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_346 {
    private final Production31_346 production = new Production31_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
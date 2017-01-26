package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_374 {
    private final Production31_374 production = new Production31_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
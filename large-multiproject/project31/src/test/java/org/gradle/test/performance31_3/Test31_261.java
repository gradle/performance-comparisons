package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_261 {
    private final Production31_261 production = new Production31_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
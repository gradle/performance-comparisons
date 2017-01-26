package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_280 {
    private final Production31_280 production = new Production31_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
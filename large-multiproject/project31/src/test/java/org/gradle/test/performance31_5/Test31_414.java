package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_414 {
    private final Production31_414 production = new Production31_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
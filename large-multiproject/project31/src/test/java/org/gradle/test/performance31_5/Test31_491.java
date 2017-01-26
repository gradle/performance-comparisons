package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_491 {
    private final Production31_491 production = new Production31_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
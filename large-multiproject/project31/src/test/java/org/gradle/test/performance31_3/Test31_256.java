package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_256 {
    private final Production31_256 production = new Production31_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
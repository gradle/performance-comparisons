package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_101 {
    private final Production31_101 production = new Production31_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
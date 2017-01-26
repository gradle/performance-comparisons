package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_133 {
    private final Production31_133 production = new Production31_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
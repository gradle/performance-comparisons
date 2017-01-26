package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_184 {
    private final Production31_184 production = new Production31_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
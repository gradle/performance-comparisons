package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_197 {
    private final Production31_197 production = new Production31_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
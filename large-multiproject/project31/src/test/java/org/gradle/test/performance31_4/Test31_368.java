package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_368 {
    private final Production31_368 production = new Production31_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
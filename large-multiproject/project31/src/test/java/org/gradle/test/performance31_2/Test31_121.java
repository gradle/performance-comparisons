package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_121 {
    private final Production31_121 production = new Production31_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
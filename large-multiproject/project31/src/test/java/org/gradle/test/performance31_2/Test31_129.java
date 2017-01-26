package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_129 {
    private final Production31_129 production = new Production31_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
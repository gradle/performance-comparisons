package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_208 {
    private final Production31_208 production = new Production31_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
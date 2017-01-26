package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_219 {
    private final Production31_219 production = new Production31_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
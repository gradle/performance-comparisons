package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_219 {
    private final Production80_219 production = new Production80_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_219 {
    private final Production84_219 production = new Production84_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
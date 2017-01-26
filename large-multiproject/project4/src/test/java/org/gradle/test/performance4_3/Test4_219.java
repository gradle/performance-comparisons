package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_219 {
    private final Production4_219 production = new Production4_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
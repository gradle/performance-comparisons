package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_219 {
    private final Production75_219 production = new Production75_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
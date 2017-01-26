package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_219 {
    private final Production47_219 production = new Production47_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
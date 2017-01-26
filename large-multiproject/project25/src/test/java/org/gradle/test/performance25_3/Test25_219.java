package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_219 {
    private final Production25_219 production = new Production25_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
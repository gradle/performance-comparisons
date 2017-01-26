package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_219 {
    private final Production13_219 production = new Production13_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
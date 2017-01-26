package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_219 {
    private final Production93_219 production = new Production93_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
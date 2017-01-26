package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_219 {
    private final Production58_219 production = new Production58_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
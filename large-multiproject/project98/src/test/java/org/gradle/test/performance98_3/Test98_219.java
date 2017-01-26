package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_219 {
    private final Production98_219 production = new Production98_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
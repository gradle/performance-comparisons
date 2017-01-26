package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_219 {
    private final Production86_219 production = new Production86_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
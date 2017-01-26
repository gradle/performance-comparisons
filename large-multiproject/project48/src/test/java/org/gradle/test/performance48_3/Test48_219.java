package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_219 {
    private final Production48_219 production = new Production48_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
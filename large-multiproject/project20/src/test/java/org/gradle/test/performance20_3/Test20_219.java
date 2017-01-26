package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_219 {
    private final Production20_219 production = new Production20_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
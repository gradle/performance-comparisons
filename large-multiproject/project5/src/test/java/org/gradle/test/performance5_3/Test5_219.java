package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_219 {
    private final Production5_219 production = new Production5_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
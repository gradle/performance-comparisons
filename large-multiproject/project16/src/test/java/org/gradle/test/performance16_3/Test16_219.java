package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_219 {
    private final Production16_219 production = new Production16_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
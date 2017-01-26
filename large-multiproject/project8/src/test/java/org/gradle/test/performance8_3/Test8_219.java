package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_219 {
    private final Production8_219 production = new Production8_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
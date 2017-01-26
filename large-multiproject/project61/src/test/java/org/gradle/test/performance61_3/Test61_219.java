package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_219 {
    private final Production61_219 production = new Production61_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
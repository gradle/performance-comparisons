package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_219 {
    private final Production3_219 production = new Production3_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
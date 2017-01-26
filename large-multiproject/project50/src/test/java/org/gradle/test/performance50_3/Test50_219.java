package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_219 {
    private final Production50_219 production = new Production50_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
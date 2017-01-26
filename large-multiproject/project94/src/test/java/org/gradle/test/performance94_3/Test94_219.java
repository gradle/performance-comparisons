package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_219 {
    private final Production94_219 production = new Production94_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
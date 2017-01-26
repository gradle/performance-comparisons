package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_219 {
    private final Production97_219 production = new Production97_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
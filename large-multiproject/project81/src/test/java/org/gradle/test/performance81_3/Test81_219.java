package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_219 {
    private final Production81_219 production = new Production81_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
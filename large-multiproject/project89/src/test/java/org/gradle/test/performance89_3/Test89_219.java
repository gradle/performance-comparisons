package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_219 {
    private final Production89_219 production = new Production89_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
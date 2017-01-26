package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_219 {
    private final Production70_219 production = new Production70_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
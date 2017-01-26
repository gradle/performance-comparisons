package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_219 {
    private final Production62_219 production = new Production62_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
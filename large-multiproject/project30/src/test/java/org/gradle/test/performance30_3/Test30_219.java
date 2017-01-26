package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_219 {
    private final Production30_219 production = new Production30_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
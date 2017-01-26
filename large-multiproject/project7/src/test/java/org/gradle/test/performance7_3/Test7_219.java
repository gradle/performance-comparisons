package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_219 {
    private final Production7_219 production = new Production7_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_219 {
    private final Production49_219 production = new Production49_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
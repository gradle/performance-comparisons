package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_219 {
    private final Production15_219 production = new Production15_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
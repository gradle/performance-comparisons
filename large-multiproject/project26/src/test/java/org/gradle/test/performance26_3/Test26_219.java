package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_219 {
    private final Production26_219 production = new Production26_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
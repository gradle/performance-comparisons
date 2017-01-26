package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_219 {
    private final Production85_219 production = new Production85_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
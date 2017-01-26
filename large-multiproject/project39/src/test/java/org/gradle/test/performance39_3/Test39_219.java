package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_219 {
    private final Production39_219 production = new Production39_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
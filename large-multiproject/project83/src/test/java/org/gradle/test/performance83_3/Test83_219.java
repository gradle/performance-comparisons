package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_219 {
    private final Production83_219 production = new Production83_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
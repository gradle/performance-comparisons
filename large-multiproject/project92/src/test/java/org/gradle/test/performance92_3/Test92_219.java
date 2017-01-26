package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_219 {
    private final Production92_219 production = new Production92_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
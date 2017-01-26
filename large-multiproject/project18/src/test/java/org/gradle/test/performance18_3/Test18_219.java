package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_219 {
    private final Production18_219 production = new Production18_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
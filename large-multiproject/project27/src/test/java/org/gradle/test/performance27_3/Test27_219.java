package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_219 {
    private final Production27_219 production = new Production27_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
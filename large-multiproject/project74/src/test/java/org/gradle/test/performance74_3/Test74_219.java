package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_219 {
    private final Production74_219 production = new Production74_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_219 {
    private final Production43_219 production = new Production43_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
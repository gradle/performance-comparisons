package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_219 {
    private final Production90_219 production = new Production90_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
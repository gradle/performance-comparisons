package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_219 {
    private final Production11_219 production = new Production11_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
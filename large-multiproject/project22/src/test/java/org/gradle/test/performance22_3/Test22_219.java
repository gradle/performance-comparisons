package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_219 {
    private final Production22_219 production = new Production22_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
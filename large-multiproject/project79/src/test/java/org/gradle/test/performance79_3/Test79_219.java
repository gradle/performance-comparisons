package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_219 {
    private final Production79_219 production = new Production79_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
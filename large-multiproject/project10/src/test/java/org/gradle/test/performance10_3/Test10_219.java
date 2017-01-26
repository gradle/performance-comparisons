package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_219 {
    private final Production10_219 production = new Production10_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
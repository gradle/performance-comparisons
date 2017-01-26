package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_219 {
    private final Production95_219 production = new Production95_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
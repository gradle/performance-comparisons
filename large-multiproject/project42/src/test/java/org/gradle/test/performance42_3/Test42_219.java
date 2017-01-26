package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_219 {
    private final Production42_219 production = new Production42_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
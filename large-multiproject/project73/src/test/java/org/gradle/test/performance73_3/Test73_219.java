package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_219 {
    private final Production73_219 production = new Production73_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
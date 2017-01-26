package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_219 {
    private final Production66_219 production = new Production66_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
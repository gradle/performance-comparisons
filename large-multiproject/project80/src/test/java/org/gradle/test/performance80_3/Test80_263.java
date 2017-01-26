package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_263 {
    private final Production80_263 production = new Production80_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
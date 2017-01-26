package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_263 {
    private final Production84_263 production = new Production84_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
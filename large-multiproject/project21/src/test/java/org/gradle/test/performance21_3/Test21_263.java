package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_263 {
    private final Production21_263 production = new Production21_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
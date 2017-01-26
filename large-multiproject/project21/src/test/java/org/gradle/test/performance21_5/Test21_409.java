package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_409 {
    private final Production21_409 production = new Production21_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_239 {
    private final Production21_239 production = new Production21_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_238 {
    private final Production21_238 production = new Production21_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
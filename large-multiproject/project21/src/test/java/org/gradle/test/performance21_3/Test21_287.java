package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_287 {
    private final Production21_287 production = new Production21_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
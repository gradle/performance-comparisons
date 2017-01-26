package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_178 {
    private final Production21_178 production = new Production21_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
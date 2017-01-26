package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_174 {
    private final Production21_174 production = new Production21_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
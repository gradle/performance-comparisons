package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_184 {
    private final Production21_184 production = new Production21_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
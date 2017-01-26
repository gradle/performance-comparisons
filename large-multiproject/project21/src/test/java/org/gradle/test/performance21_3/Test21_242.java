package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_242 {
    private final Production21_242 production = new Production21_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
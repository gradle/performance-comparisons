package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_158 {
    private final Production21_158 production = new Production21_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
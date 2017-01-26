package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_182 {
    private final Production21_182 production = new Production21_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
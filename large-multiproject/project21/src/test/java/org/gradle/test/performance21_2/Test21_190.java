package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_190 {
    private final Production21_190 production = new Production21_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
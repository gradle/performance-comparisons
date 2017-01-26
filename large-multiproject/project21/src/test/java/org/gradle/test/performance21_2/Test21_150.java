package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_150 {
    private final Production21_150 production = new Production21_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
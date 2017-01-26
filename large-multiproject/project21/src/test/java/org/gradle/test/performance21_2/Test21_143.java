package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_143 {
    private final Production21_143 production = new Production21_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
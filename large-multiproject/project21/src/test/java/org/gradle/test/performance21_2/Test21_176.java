package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_176 {
    private final Production21_176 production = new Production21_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
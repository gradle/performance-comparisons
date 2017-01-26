package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_154 {
    private final Production21_154 production = new Production21_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
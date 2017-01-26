package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_19 {
    private final Production21_19 production = new Production21_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_482 {
    private final Production21_482 production = new Production21_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
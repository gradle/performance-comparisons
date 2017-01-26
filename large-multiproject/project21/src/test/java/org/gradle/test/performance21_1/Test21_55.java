package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_55 {
    private final Production21_55 production = new Production21_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
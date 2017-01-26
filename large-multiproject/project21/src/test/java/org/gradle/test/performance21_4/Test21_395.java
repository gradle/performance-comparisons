package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_395 {
    private final Production21_395 production = new Production21_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
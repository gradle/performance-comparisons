package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_65 {
    private final Production21_65 production = new Production21_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
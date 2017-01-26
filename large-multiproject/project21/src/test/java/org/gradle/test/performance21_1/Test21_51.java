package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_51 {
    private final Production21_51 production = new Production21_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_341 {
    private final Production21_341 production = new Production21_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
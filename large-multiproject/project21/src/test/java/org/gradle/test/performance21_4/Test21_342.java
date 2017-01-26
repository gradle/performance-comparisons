package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_342 {
    private final Production21_342 production = new Production21_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
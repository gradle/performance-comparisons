package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_324 {
    private final Production21_324 production = new Production21_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
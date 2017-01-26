package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_321 {
    private final Production21_321 production = new Production21_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
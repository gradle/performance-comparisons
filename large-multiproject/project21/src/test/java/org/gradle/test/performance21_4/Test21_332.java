package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_332 {
    private final Production21_332 production = new Production21_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
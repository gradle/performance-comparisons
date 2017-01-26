package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_249 {
    private final Production21_249 production = new Production21_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
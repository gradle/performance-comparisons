package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_33 {
    private final Production21_33 production = new Production21_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
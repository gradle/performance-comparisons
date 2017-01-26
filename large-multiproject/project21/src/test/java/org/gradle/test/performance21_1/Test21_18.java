package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_18 {
    private final Production21_18 production = new Production21_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_450 {
    private final Production21_450 production = new Production21_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
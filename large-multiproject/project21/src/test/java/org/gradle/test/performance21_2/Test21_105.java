package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_105 {
    private final Production21_105 production = new Production21_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
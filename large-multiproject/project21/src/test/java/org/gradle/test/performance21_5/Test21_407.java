package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_407 {
    private final Production21_407 production = new Production21_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
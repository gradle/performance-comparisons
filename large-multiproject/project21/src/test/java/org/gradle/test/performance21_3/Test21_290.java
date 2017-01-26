package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_290 {
    private final Production21_290 production = new Production21_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
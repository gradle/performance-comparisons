package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_258 {
    private final Production21_258 production = new Production21_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
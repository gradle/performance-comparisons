package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_363 {
    private final Production21_363 production = new Production21_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
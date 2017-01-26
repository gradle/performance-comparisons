package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_334 {
    private final Production21_334 production = new Production21_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
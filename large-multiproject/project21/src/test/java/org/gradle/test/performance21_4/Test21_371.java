package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_371 {
    private final Production21_371 production = new Production21_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_370 {
    private final Production21_370 production = new Production21_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
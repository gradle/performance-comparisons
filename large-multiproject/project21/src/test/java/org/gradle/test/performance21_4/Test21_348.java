package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_348 {
    private final Production21_348 production = new Production21_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
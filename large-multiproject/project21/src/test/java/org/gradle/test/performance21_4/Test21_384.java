package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_384 {
    private final Production21_384 production = new Production21_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_32 {
    private final Production21_32 production = new Production21_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
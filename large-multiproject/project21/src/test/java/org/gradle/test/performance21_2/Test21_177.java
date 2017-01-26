package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_177 {
    private final Production21_177 production = new Production21_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
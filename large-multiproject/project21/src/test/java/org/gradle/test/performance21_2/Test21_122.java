package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_122 {
    private final Production21_122 production = new Production21_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
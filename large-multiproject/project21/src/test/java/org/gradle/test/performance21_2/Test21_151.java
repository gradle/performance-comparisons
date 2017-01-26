package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_151 {
    private final Production21_151 production = new Production21_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
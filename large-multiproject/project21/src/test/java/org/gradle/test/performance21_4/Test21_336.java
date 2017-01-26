package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_336 {
    private final Production21_336 production = new Production21_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
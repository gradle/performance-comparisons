package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_220 {
    private final Production21_220 production = new Production21_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
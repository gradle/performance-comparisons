package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_301 {
    private final Production21_301 production = new Production21_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
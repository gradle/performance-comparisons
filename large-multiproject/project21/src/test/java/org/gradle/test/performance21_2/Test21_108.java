package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_108 {
    private final Production21_108 production = new Production21_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
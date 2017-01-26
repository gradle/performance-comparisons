package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_30 {
    private final Production21_30 production = new Production21_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
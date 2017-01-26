package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_131 {
    private final Production21_131 production = new Production21_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
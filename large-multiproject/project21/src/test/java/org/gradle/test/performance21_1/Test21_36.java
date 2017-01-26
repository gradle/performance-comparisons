package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_36 {
    private final Production21_36 production = new Production21_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
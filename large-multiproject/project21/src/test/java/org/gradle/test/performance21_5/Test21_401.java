package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_401 {
    private final Production21_401 production = new Production21_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_452 {
    private final Production21_452 production = new Production21_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_137 {
    private final Production21_137 production = new Production21_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
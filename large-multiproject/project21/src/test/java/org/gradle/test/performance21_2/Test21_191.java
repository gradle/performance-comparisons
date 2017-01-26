package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_191 {
    private final Production21_191 production = new Production21_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
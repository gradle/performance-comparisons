package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_83 {
    private final Production21_83 production = new Production21_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
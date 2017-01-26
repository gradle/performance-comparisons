package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_218 {
    private final Production21_218 production = new Production21_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
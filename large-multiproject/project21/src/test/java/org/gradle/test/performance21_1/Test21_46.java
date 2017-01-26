package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_46 {
    private final Production21_46 production = new Production21_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
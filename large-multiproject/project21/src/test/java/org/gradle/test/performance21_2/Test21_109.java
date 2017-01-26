package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_109 {
    private final Production21_109 production = new Production21_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
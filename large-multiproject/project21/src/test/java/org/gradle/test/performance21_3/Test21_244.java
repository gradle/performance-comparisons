package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_244 {
    private final Production21_244 production = new Production21_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
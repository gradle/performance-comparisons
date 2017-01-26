package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_196 {
    private final Production21_196 production = new Production21_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_210 {
    private final Production21_210 production = new Production21_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
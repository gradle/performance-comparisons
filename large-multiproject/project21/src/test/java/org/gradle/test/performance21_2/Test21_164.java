package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_164 {
    private final Production21_164 production = new Production21_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
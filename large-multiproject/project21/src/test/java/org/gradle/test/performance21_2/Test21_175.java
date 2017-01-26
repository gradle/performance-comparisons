package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_175 {
    private final Production21_175 production = new Production21_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
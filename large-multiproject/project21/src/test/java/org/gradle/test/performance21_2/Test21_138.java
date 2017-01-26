package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_138 {
    private final Production21_138 production = new Production21_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
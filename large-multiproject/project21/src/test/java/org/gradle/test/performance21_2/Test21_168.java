package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_168 {
    private final Production21_168 production = new Production21_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
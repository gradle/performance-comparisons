package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_281 {
    private final Production21_281 production = new Production21_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
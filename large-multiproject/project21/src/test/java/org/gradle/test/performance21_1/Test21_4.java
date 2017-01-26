package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_4 {
    private final Production21_4 production = new Production21_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
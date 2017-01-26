package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_2 {
    private final Production21_2 production = new Production21_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
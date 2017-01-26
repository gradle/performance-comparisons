package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_1 {
    private final Production21_1 production = new Production21_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
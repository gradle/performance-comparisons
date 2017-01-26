package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_87 {
    private final Production21_87 production = new Production21_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
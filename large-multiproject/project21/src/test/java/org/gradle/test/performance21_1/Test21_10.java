package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_10 {
    private final Production21_10 production = new Production21_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
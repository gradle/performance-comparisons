package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_5 {
    private final Production21_5 production = new Production21_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
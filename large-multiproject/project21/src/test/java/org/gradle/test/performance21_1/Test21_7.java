package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_7 {
    private final Production21_7 production = new Production21_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
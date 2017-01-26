package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_81 {
    private final Production21_81 production = new Production21_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
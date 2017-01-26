package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_417 {
    private final Production21_417 production = new Production21_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
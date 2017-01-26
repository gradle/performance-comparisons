package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_415 {
    private final Production21_415 production = new Production21_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
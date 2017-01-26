package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_447 {
    private final Production21_447 production = new Production21_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
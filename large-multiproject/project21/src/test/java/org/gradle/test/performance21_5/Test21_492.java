package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_492 {
    private final Production21_492 production = new Production21_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
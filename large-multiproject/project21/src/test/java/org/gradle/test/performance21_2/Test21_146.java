package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_146 {
    private final Production21_146 production = new Production21_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_161 {
    private final Production21_161 production = new Production21_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
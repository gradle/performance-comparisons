package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_193 {
    private final Production21_193 production = new Production21_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_394 {
    private final Production21_394 production = new Production21_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
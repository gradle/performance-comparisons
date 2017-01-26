package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_252 {
    private final Production21_252 production = new Production21_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
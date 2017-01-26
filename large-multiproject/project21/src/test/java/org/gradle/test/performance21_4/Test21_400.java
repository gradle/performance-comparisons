package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_400 {
    private final Production21_400 production = new Production21_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
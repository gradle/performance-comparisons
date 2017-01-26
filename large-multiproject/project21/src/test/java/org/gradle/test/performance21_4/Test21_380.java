package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_380 {
    private final Production21_380 production = new Production21_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
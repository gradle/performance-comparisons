package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_464 {
    private final Production21_464 production = new Production21_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
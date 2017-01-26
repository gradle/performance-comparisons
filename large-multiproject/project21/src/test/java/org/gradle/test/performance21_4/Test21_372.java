package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_372 {
    private final Production21_372 production = new Production21_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
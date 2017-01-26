package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_431 {
    private final Production21_431 production = new Production21_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
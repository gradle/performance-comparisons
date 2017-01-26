package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_37 {
    private final Production21_37 production = new Production21_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
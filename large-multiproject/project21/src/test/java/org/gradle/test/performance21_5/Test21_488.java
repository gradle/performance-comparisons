package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_488 {
    private final Production21_488 production = new Production21_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
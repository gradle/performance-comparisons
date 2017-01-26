package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_84 {
    private final Production21_84 production = new Production21_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
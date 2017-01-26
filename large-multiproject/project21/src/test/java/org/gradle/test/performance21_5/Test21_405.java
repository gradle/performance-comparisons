package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_405 {
    private final Production21_405 production = new Production21_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}